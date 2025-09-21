package src.module08;

public class Recursion {

    static int sum(int n) {
        
        if(n <= 0)
            return 0;

        return n + sum(n - 1);
    }

    static int fibonacci(int n) {
        
        if(n == 0 || n == 1)
            return n;

        if(n < 0) 
            return -1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(sum(4));
        System.out.println(sum(5));
        System.out.println(sum(10));
        
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(10));
    }
}
