import java.util.Scanner;

public class String_Compression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String for compression");
        String in = scan.next();
        System.out.println(compressedString(in));
    }
    //Time Complexity O(n^2) - because of 2 for loop
    //Space Complexity O(n)
    public static String compressedString(String str) {
        char[] charArr = str.toLowerCase().toCharArray();
        int p1 = 0;
        int p2 = 0;
        StringBuilder ans = new StringBuilder();
        StringBuilder old = new StringBuilder();
        for(int i=0; i<charArr.length; i++) {
            int count = 0;
            char occur = charArr[i];
            if (old.indexOf(String.valueOf(occur)) == -1) {
                for(int j=0; j<charArr.length; j++) {
                    if(occur == charArr[j]) {
                        count++;
                    }
                }
                ans.append(occur);
                if(count>1) {
                    ans.append(count);
                }
                old.append(occur);
            }
        }
        return ans.toString();
    }
}
