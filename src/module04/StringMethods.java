package src.module04;

public class StringMethods {
    public static void main(String[] args) {
        
        String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt1.length()); // 26

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase()); // HELLO WORLD
        System.out.println(txt2.toLowerCase()); // hello world

        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); // 7

        String txt4 = "Hello";
        System.out.println(txt4.charAt(0));  // H
        System.out.println(txt4.charAt(4));  // o

        String txt5 = "     Hello    ";
        System.out.println(txt5.trim()); // Hello

        String str1 = "string";
        String str2 = "string";
        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true
    }
}
