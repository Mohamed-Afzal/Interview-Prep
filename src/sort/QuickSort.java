package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(new Integer[] {9, 4, 7, 6, 3, 1, 5});
        System.out.println("Before sorting array: ");
        for (Integer value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        quickSort(arr, 0, arr.size() - 1);
        System.out.println("After sorting array: ");
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    static void quickSort(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1, high);
        }
    }

    static int partition(List<Integer> arr, int low, int high){
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        // Swap pivot into correct place
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }


}
