public class ArraySecondLargest {
    public static void main(String[] args) {
        int[] val = {2,1,23,12,5};
        System.out.println(findSecondLargest(val));
    }

    public static int findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
