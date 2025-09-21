package src.module08;

public class Methods {

    static void helloWorld() {
        System.out.println("Hello World!");
    }

    static void greeting(String name) {
        System.out.println("Hello " + name);
    }

    static int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        helloWorld();
        greeting("Samm");
        
        System.out.println(sum(10, 15));
    }
}
