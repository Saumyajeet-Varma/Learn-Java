package src.module08;

public class MethodOverloading {

    static int add(int x, int y) {
        return x + y;
    }

    static double add(double x, double y) {
        return x + y;
    }

    static String add(String x, String y) {
        return x + " " + y;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1.1, 2.2));
        System.out.println(add("hello", "world"));
    }
}
