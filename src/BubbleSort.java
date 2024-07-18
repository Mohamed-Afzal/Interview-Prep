import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,1,13,4,5};
        bubble(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void bubble(int [] arr){
        boolean swap;
         for(int i = 0; i< arr.length; i++){
             swap = false;
             for(int j = 1; j< arr.length-i; j++){
                 if(arr[j] <arr[j-1]) {
                     int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = temp;
                     swap=true;
                 }
             }
             if(!swap)
                 break;
         }
    }
}
