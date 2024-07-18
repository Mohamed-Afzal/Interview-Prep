import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {2,1,13,4,5};
        selectionSort(arr);
        System.out.print(Arrays.toString(arr));
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
}
