import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";

//	    str1.toLowerCase();
//	    str2.toLowerCase();
        if(str1.length() == str2.length()) {
            char[] charArr1 = str1.toLowerCase().toCharArray();
            char[] charArr2 = str2.toLowerCase().toCharArray();

            //sort using for loop
            charArr1 = sortString(charArr1);
            charArr2 = sortString(charArr1);

            //sort using array
//	    	Arrays.sort(charArr1);
//	    	Arrays.sort(charArr2);

            boolean sts = Arrays.equals(charArr1, charArr2);
            if(sts) {
                System.out.println(str1 + " and " + str2 + " are anagram");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }
    }

    public static char[] sortString(char[] charArray) {
        int n = charArray.length;
        //Bubble Sort
        for (int i = 0; i < n - 1; i++) { //iterates element
            for (int j = i+1; j < n; j++) { //compares element & swap
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }

        return charArray;
    }
}
