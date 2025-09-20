package src.module07;

public class Arrays {
    public static void main(String[] args) {
        
        int[] nums = {3, 1, 4, 2, 5};
        
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }

        nums[0] = 6;

        for(int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }




        // new Keyword_________________________

        String[] words = new String[5];

        words[0] = "Apple";
        words[1] = "Ball";
        words[2] = "Cat";
        words[3] = "Dog";
        words[4] = "Elephant";

        for(int i = 0; i < 5; i++) {
            System.out.println(words[i]);
        }




        // with new_________________________

        int[] arr1 = new int[] {1, 2, 3, 4, 5};

        for(int num: arr1) {
            System.out.println(num);
        }

        // shortcut (most common)_________________________
        
        int[] arr2 = {1, 2, 3, 4, 5};

        for(int num: arr2) {
            System.out.println(num);
        }
    }
}
