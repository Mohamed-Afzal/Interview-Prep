public class ArmstrongNumber {
    public static void main(String[] args) {
        for(int i = 0; i <= 1000; i ++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        int count = String.valueOf(n).length();
        while (n > 0){
            int last = n%10;
            sum += Math.pow(last, count);
            n /= 10;
        }
        return sum == original;
    }
}
