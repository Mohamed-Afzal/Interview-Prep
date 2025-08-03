package MathConcept;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumber(214234);
    }

    static void reverseNumber(int n){
        int rev = 0;
        while(n>0){
            int last = n%10;
            rev = (rev*10)+last;
            n = n/10;
        }
         System.out.println(rev);
    }
}
