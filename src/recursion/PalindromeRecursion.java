package recursion;

public class PalindromeRecursion {
    public static void main(String[] args) {
        String a = "MADAM"; 
        System.out.println(palindrome(0, a));
    }

    private static boolean palindrome(int i, String a) {
        if(i > a.length()/2) return true;
        if(a.charAt(i) != a.charAt(a.length() -i-1)) return false;
        return palindrome(i +1, a);
    }
}
