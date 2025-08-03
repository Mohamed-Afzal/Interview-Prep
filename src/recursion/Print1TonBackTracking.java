package recursion;

import java.util.Scanner;

public class Print1TonBackTracking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        f(n, n);
    }

    static void f(int i, int n){
        if (i<1) return;
        f(i-1, n);
        System.out.println(i);
    }
}
