package recursion;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        f(1, n);
    }

    static void f(int i, int n){
        if (i>n) return;
        System.out.println("Raj");
        f(i+1, n);
    }
}
