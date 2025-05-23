public class P74 {
    public static int maxTop(int[] nums, int k) {
        int n = nums.length;

        if (k == 0)
            return nums[0];
        if (n == 1)
            return (k % 2 == 0) ? nums[0] : -1;

        int maxVal = Integer.MIN_VALUE;

        // Consider first k-1 elements
        for (int i = 0; i < Math.min(n, k - 1); i++) {
            maxVal = Math.max(maxVal, nums[i]);
        }

        // Also check nums[k] if it exists
        if (k < n) {
            maxVal = Math.max(maxVal, nums[k]);
        }

        return maxVal;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 2, 2, 4, 0, 6 };
        int k = 5;
        System.out.println(maxTop(nums, k)); // Output: 5
        
    }
}