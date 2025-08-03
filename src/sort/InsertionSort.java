package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {2,1,13,4,5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        int [] arr2 = {2,1,13,4,5};
        insertionSort2(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void insertionSort(int [] arr){
        for (int i =0; i< arr.length-1; i++){
            for(int j =i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else
                    break;
            }
        }
    }

    static void insertionSort2(int [] arr){
        for(int i=0; i<= arr.length-1; i++){
            int j=i;
            while(j>0 && arr[j-1] >arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
