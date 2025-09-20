package src.module06;

public class BreakContinue {
    public static void main(String[] args) {
        
        // Break_________________________

        for(int i = 0; i < 10; i++) {
            
            if(i == 5) 
                break;

            System.out.println(i);
        }




        // Continue_________________________

        for(int i = 0; i < 10; i++) {
            
            if(i == 5)
                continue;

            System.out.println(i);
        }
    }
}
