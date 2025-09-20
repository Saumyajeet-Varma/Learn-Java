package src.module06;

public class NestedLoop {
    public static void main(String[] args) {
        
        // Nested for loop_________________________

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println(i + " " + j);
            }
        }




        // Nested while loop_________________________

        int x = 0;
        while(x < 2) {

            int y = 0;
            while(y < 3) {
                System.out.println(x + " " + y);
                y++;
            }

            x++;
        }
    }
}
