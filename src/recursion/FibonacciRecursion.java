package recursion;

public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(fibo(4));
        fibonacci(0, 1, 0);
        recursionPrint(1);
    }

    static void fibonacci (int start, int end, int base){
        System.out.println(start);
        if (base == 10)  return;
        fibonacci(end, start+end, ++base);
    }

    static int fibo(int n){
        if(n<2) return n;  // if the n is 1 or 0 it'll return the same
        return fibo(n-1)+fibo(n-2); //recurrence relation
    }

    static void recursionPrint(int n){
        System.out.println(n);
        if(n == 10)
            return;
        recursionPrint(++n);
    }
}
