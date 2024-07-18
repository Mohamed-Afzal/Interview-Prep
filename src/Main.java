import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        func();
        func(1,2,3,4,5,6);


        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col< arr[row].length; col++) {
                arr [row] [col] = in.nextInt();
            }
        }

        //O/P
        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col< arr[row].length; col++) {
                System.out.print(arr [row] [col] + " ");
            }
            System.out.println(); // for breaking the line for next row
        }



//        for(int i = 0; i <= 1000; i ++){
//            if(isArmstrong(i)){
//                System.out.println(i);
//            }
//        }
    }

    static void func(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        int count = String.valueOf(n).length();
        while (n > 0){
            int last = n%10;
            sum += Math.pow(last, count);
            n /= 10;
        }
        return sum == original;
    }

}