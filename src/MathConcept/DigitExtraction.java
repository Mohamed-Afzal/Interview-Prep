package MathConcept;

public class DigitExtraction {
    public static void main(String[] args) {
        digitExtraction(32532);
    }

    static void digitExtraction(int n){
        int cnt=0;
        while(n>0){
            int last = n%10; //takes last
            System.out.println(last);
            cnt++;
            n=n/10; //removes last
        }
        System.out.println("digit total count = "+cnt);
    }
}
