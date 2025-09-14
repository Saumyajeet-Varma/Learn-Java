package src.module02;

public class Numbers {
    public static void main(String[] args) {
        
        // Integer Types_________________________
        
        byte i1 = 100; // byte can store -128 to 127
        System.out.println(i1);

        short i2 = 5000; // short can store -32768 to 32767
        System.out.println(i2);
        
        int i3 = 100000; // int can store -2147483648 to 2147483647
        System.out.println(i3);
        
        long i4 = 15000000000L; // long can store -9223372036854775808 to 9223372036854775807
        System.out.println(i4);
        
        
        
        
        // Floating Types_________________________
        
        float f1 = 1.99f; // The precision of float is only 6-7 decimal digits
        System.out.println(f1);
        
        double f2 = 1.99d; // The precision of double is about 16 decimal digits
        System.out.println(f2);

        // Scientific Numbers
        float x1 = 35e3f;
        System.out.println(x1);
        double x2 = 12E4d;
        System.out.println(x2);
    }
}
