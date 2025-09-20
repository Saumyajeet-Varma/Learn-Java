package src.module07;

public class MultidimensionalArray {
    public static void main(String[] args) {
        
        int[][] myNums = {{1, 2, 3}, {4, 5, 6}};

        for(int row = 0; row < myNums.length; row++) {
            for(int col = 0; col < myNums[row].length; col++) {
                System.out.print(myNums[row][col] + " ");
            }

            System.err.print("\n");
        }

        myNums[0][0] = 7;
        myNums[1][2] = 0;

        for(int row = 0; row < myNums.length; row++) {
            for(int col = 0; col < myNums[row].length; col++) {
                System.out.print(myNums[row][col] + " ");
            }

            System.err.print("\n");
        }
    }
}
