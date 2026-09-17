public class Main {
    public static void main(String[] args) {
        
        Solution solver = new Solution();

        // Test Case 1
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println("Test 1 Result: " + solver.canPlaceFlowers(flowerbed1, n1)); // Output: true

        // Test Case 2
        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println("Test 2 Result: " + solver.canPlaceFlowers(flowerbed2, n2)); // Output: false
    }
}

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        for (int i = 0; i < length; i++) {
            if (n <= 0) return true;
            
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == length - 1) || (flowerbed[i + 1] == 0);
                
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <= 0;
    }
}