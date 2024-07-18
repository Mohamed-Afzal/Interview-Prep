import java.util.Arrays;

public class RowColMatrixUsingBS {
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr, 37)));
    }

    static int[] search(int [][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;

        while(r < matrix.length && c>=0){
            if(matrix[r][c] == target){
                return new int[]{r, c};
            } else if (matrix[r][c] < target){
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }

//    static int [][] sortedMatrix(int [][] matrix, int target){
//        int rows = matrix.length;;
//        int col = matrix[0].length;
//
//        if(){
//
//        }
//    }

    static int[] binarySearch(int [][] matrix, int row, int cstart, int cend, int target){
        while(cstart <= cend){
            int mid = cstart + (cend - cstart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix [row][mid] < target){
                cstart = mid+1;
            } else {
                cend = mid -1;
            }
        }
        return new int[]{-1,-1};
    }
}
