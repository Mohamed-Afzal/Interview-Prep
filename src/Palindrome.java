public class Palindrome {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str){
        if(str == null) return true;
        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            char startchar = str.charAt(start++);
            char endchar = str.charAt(end--);
            if(startchar != endchar) return false;
        }
        return true;
    }


}
