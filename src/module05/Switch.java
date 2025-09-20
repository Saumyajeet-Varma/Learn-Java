package src.module05;

public class Switch {
    public static void main(String[] args) {
        
        int x = 2;

        switch(x) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            case 3:
                System.out.println("x is 3");
                break;
            case 4:
                System.out.println("x is 4");
                break;
            case 5:
                System.out.println("x is 5");
                break;
            default:
                System.out.println("Cases not matched");
                break;
        }
    }
}
