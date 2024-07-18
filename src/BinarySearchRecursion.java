public class BinarySearchRecursion {
    public static void main(String[] args) {
        int [] arr = {-11,-1, 0,2,3,4,6,7,17,19,21};
        int target = 0;
        System.out.println(bsRecursion(arr, target, 0, arr.length-1));
    }

    static int bsRecursion (int [] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if (target < arr[mid])
            return bsRecursion(arr, target, start, end-1);
        return bsRecursion(arr, target, start+1, end);
    }
}
