package bitManipulation;

import java.util.*;

public class BinaryConversion {

    public static List<String> noToBinary(int n){
        List<String> response = new ArrayList<>();
        while (n!=0){
            if(n%2 == 1) response.add("1");
            else response.add("0");
            n/=2;
        }
        Collections.reverse(response);

        return response;
    }

    public static int binaryToNo(List<String> binary){
        int val = 0;
        int power = 1;
        int size = binary.size();
        for(int i =size-1; i >=0; i--){
            if(Objects.equals(binary.get(i), "1")){
                val = val + power;
            }
            power *=2;
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println("Binary Converted : "+noToBinary(13));
        System.out.println("Number Converted : "+binaryToNo(Arrays.asList("1", "1", "0", "1")));
    }
}
