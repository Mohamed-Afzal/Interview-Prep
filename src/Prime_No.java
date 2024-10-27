public class Prime_No {
    public static void main(String[] args) {
        int number = 8;
        boolean flag = false;
        for(int i=2; i<number/2; i++) {
            if (number % 1 == 0) {
                flag = false;
                break;
            }
        }
        if((number == 0 || number == 1) || flag) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }
    }
}
