package MathConcept;

public class CountDIgit {
    public static void main(String[] args) {
        countDigits(32434);
        countDigitsWhile(214325);
    }

    static void countDigits(int n){
        int count = (int) (Math.log10(n) +1);
        System.out.println("digit total count = "+count);
    }

    static void countDigitsWhile(int n){
        int cnt=0;
        while(n>0){
            cnt++;
            n=n/10; //removes last
        }
        System.out.println("digit total count while loop = "+cnt);
    }
}
