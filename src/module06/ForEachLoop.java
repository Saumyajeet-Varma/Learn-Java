package src.module06;

public class ForEachLoop {
    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 4, 5};

        for(int num: nums) {
            System.out.println(num);
        }

        String[] words = {"Apple", "Ball", "Cat"};

        for(String word: words) {
            System.out.println(word);
        }
    }
}
