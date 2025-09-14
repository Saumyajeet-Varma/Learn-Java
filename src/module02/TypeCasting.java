package src.module02;

public class TypeCasting {
    public static void main(String[] args) {
        
        // Widening Casting_________________________
        
        int myInt1 = 10;
        double myDouble1 = myInt1;

        System.out.println(myInt1);
        System.out.println(myDouble1);




        // Narrowing Casting_________________________

        double myDouble2 = 10.21d;
        int myInt2 = (int) myDouble2;

        System.out.println(myDouble2);
        System.out.println(myInt2);
    }
}
