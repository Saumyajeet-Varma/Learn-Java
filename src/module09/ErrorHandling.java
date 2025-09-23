package src.module09;

public class ErrorHandling {
    public static void main(String[] args) {
        
        // try-catch_________________________

        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[10]);
        }
        catch(Exception e) {
            System.out.println(e);
        }




        // try-catch-finally_________________________

        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[10]);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Try-catch done");
        }




        // throw_________________________

        int age = 15;

        if(age < 18) {
            throw new ArithmeticException("Access Denied");
        }
        else {
            System.out.println("Access Granted");
        }
    }
}
