public class CeilingNumber {
    public static void main(String[] args) {
        int [] arr = {-11,-1, 0,2,3,4,6,7,17,19,21};
        int target = 2;
        System.out.println(ceiling(arr, target));
    }

    //smallest no >= target
    static int ceiling(int[] arr, int target){
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            } else if (target < arr[mid]) {
                end = mid-1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
