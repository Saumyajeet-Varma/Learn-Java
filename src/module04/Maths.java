package src.module04;

public class Maths {
    public static void main(String[] args) {
        
        System.out.println(Math.max(5, 10)); // 10
        System.out.println(Math.min(5, 10)); // 5

        System.out.println(Math.sqrt(64)); // 8.0

        System.out.println(Math.abs(-2.5)); // 2.5

        System.out.println(Math.pow(2, 9)); // 512

        System.out.println(Math.round(9.6)); // 10
        System.out.println(Math.ceil(9.6)); // 10.0
        System.out.println(Math.floor(9.6)); // 9.0

        System.out.println(Math.random()); // Random value between 0.0 (inclusive) to 1.0 (exclusive)
        System.out.println((int)(Math.random() * 101)); // Random value between 0 to 100
    }
}
