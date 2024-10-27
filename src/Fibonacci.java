public class Fibonacci {
    public static void main(String[] args) {
        int count = 5;
        int prev= 0, current=1;
        for(int i=0; i<count; i++) {
            System.out.println(prev);
            //with temp
//			int result = current + prev;
//			prev = current;
//			current = result;

            //without temp
            current = current + prev;
            prev = current - prev;
        }
    }
}