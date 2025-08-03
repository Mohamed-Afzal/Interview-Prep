package Pattern;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        pattern(scan.nextInt());
//        pattern2(scan.nextInt());
//        pattern3(scan.nextInt());
        pattern10(scan.nextInt());
    }

    static void pattern (int n){
        for (int i =0; i<n; i++){
            for (int j = 0; j<n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern2 (int n){
        for (int i =0; i<n; i++){
            for (int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern3 (int n){
        for (int i =0; i<n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    static void pattern4 (int n){
        for (int i =0; i<n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }

    static void pattern5 (int n){
        for (int i =0; i<=n; i++){
            for (int j = 0; j<n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern6 (int n){
        for (int i =0; i<=n; i++){
            for (int j = 1; j<n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    static void pattern7 (int n){
        for (int i =0; i<n; i++){
            for (int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for (int j = 0; j<2*i+1; j++){
                System.out.print("*");
            }
            for (int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    static void pattern8 (int n){
        for (int i =0; i<n; i++){
            for (int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j<2*n-(2*i+1); j++){
                System.out.print("*");
            }
            for (int j = 0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    static void pattern9 (int n){
        for (int i =0; i<n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i =0; i<n; i++){
            for (int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j<2*n-(2*i+1); j++){
                System.out.print("*");
            }
            for (int j = 0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    static void pattern10 (int n){
        for (int i=1; i<=2*n-1; i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            for(int j=1;j<=stars; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
