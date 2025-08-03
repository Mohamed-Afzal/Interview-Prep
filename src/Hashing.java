import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashing {

    public static void main(String[] args) {
//        numberHashing();
//        characterHashing();
        numberHashingMap();
    }

    private static void numberHashing() {
        Scanner scan = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the value of n : ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.print("Enter values of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Initialize hashing array (assuming numbers are within a reasonable range)
        int[] hash = new int[100000000];

        // Compute frequency of each number
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Input queries
        System.out.print("Enter number of queries: ");
        int q = scan.nextInt();
        System.out.print("Enter numbers to find count in array : ");
        while (q > 0) {
            int number = scan.nextInt();
            q--;
            System.out.println(hash[number]);
        }

        scan.close();
    }

    private static void characterHashing(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String value : ");
        String s = scan.next();

        //Precompute
        int hash[] = new int[26];
        for (int i =0; i<s.length(); i++){
            hash[s.charAt(i) - 'a']++;
        }

        System.out.print("Enter number of query : ");
        int q = scan.nextInt();
        while(q>0){
            char c = scan.next().charAt(0);
            q--;
            System.out.println(hash[c-'a']);
        }
        scan.close();
    }

    private static void numberHashingMap() {
        Scanner scan = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the value of n : ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.print("Enter values of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Initialize hashing array (assuming numbers are within a reasonable range)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        map.forEach((key, value) -> System.out.println(key + " " + value));


        // Input queries
        System.out.print("Enter number of queries: ");
        int q = scan.nextInt();
        System.out.print("Enter numbers to find count in array : ");
        while (q > 0) {
            int number = scan.nextInt();
            q--;
            System.out.println(map.getOrDefault(q, 0));
        }

        scan.close();
    }

}
