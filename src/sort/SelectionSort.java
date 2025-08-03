package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {2,1,13,4,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        int [] arr1 = {2,1,13,4,5};
        selectionSort1(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void selectionSort(int [] arr){
        for(int i=0; i< arr.length; i++){
            int last = arr.length - i - 1;
//            int maxIndex = getMaxIndex(arr, 0, last);
//            swap(arr, maxIndex, last);
            //maxindex
            int start = 0;
            int max = start;
            for (int j = start; j <= last; j++){
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
            //swap
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void selectionSort1(int [] arr) {
        for (int i =0; i<= arr.length-2; i++){
            int minimum = i;
            for (int j =i; j<=arr.length-1; j++){
                if(arr[j]<arr[minimum]) minimum = j;
            }
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
    }
}
