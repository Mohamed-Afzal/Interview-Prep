package leetCode;

import java.util.Arrays;

public class LeetCode {

    public static boolean checkIfArrayIsSortedAndRotated(int[] nums) {
        int count= 0;
        for (int i =0; i< nums.length-1; i ++){
            if(nums[i] > nums[i+1]) count++;
        }
        if(nums[nums.length-1] > nums[0]) count++;
        return count <= 1;
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for(int j =1; j<nums.length; j ++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static int [] rotate(int[] nums, int k) {
        int count = 0;
        int [] temp = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            temp[(i+k) % nums.length] = nums[i];
        }
        nums = temp;
        return nums;
    }

    public static void main(String[] args) {
        int[] rotate = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(rotate(rotate, 3)));

//        int[] nums = {3,4,5,1,2};
//        System.out.println(checkIfArrayIsSortedAndRotated(nums));
//        int[] nums2 = {2,1,3,4};
//        System.out.println(checkIfArrayIsSortedAndRotated(nums2));
//
//        int[] rem = {0,0,1,1,1,2,2,3,3,4};
//        System.out.println(removeDuplicates(rem));
    }
}
