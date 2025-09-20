package src.module05;

public class IfElse {
    public static void main(String[] args) {

        // if_________________________

        boolean w = true;

        if(w)
            System.out.println("This statement will execute");

        if(!w)
            System.out.println("This statement will never execute");


        
        
        // if, else_________________________
        
        boolean x = true;
        boolean y = false;

        if(x)
            System.out.println("x is true");
        else
            System.out.println("x is False");

        if(y)
            System.out.println("y is true");
        else
            System.out.println("y is False");

        


        // if, else if, else_________________________ 

        int a = 10;
        int b = 5;

        if(a < b)
            System.out.println("a is less than b");
        else if(a > b)
            System.out.println("a is greater than b");
        else
            System.out.println("a is equal to b");

        


        // Nested if-else_________________________

        int z = 100;

        if(z > 0) {
            
            System.out.println("z is positive");
            
            if(z < 10) {
                System.out.println("z is less than 10");
            }
            else {
                System.out.println("z is not less than 10");
            }
        }
        else if(z < 0) {

            System.out.println("z is negative");

            if(z < -10) {
                System.out.println("z is less than -10");
            }
            else {
                System.out.println("z is not less than -10");
            }
        }
        else {
            System.out.println("z is zero");
        }
    }
}