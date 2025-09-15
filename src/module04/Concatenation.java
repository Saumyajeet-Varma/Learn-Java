package src.module04;

public class Concatenation {
    public static void main(String[] args) {

        // Strings_________________________
        
        String x = "Hello";
        String y = "World";
        String z = "!";
        
        System.out.println(x + " " + y); // Hello World
        System.out.println(x.concat(y)); // HelloWorld
        System.out.println(x.concat(y).concat(z)); // HelloWorld!




        // Strings and Numbers_________________________

        int i1 = 10;
        int i2 = 20;
        System.out.println(i1 + i2); // 30
        
        String s1 = "10";
        String s2 = "20";
        System.out.println(s1 + s2); // 1020

        String s = "10";
        int i = 20;
        System.out.println(s + i); // 1020

    }
}
