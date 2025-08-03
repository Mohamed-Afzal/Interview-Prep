package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,1,13,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

        int [] arr2 = {2,1,13,4,5};
        bubble2(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void bubble(int [] arr){
        boolean swap;
         for(int i = 0; i< arr.length; i++){
             swap = false;
             for(int j = 1; j< arr.length-i; j++){
                 if(arr[j] <arr[j-1]) {
                     int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = temp;
                     swap=true;
                 }
             }
             if(!swap)
                 break;
         }
    }

    static void bubble2(int [] arr){
        boolean swap;
        for (int i=arr.length-1; i>=1; i--){
            swap = false;
            for (int j = 0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            if(!swap) break;
        }
    }
}
