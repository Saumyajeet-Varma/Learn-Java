package src.module05;

public class TernaryOperator {
    public static void main(String[] args) {
        
        boolean x = true;
        boolean y = false;

        int a = x ? 10 : 5;
        System.out.println(a); // 10
        
        int b = y ? 10 : 5;
        System.out.println(b); // 5
        
        int z = a > b ? a - b : b - a;
        System.out.println(z); // 10 - 5 = 5
    }
}
