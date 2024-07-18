public class FloorNumber {
    public static void main(String[] args) {
        int [] arr = {-11,-1, 0,2,3,4,6,7,17,19,21};
        int target = -2;
        System.out.println(floorNumber(arr, target));
    }

    //greatest number <= target
    static int floorNumber(int [] arr, int target){
        if(target < arr[0]){
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
        return arr[end];
    }
}
