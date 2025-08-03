package recursion;

public class TwoPointerRecursion {

    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        reverse(0, arr, arr.length-1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    static void reverse(int l, int[] arr, int r){
        if(l>r) return;
        swap(l, arr, r);
        reverse(l+1,arr, r-1);
    }

    private static void swap(int l, int[] arr, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

}
