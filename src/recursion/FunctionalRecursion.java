package recursion;

import java.util.Scanner;

public class FunctionalRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = sumOfFirstNNumber(n);
        System.out.println("sum = "+sum);
        int fact = factorialNNumber(n);
        System.out.println("factorial = "+fact);
    }

    static int sumOfFirstNNumber(int n){
        if (n==0) return 0;
        return n + sumOfFirstNNumber(n-1);
    }

    static int factorialNNumber(int n){
        if (n==0) return 1;
        return n * factorialNNumber(n-1);
    }
}
