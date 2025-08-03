package recursion;

import java.util.Scanner;

public class ParameterizedRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        sumOfFirstNNumber(n, 0);
    }

    static void sumOfFirstNNumber(int i, int sum){
        if (i<1){
            System.out.println(sum);
            return;
        }
        sumOfFirstNNumber(i-1, sum+i);
    }
}
