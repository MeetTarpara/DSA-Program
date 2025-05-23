// 40 Given an array nums with n integers, your task is to check if it could become non-decreasing
// by modifying at most one
// Input: nums = [4,2,3]
// Output: true
// Explanation: You could modify the first 4 to 1 to get a non-decreasing array.


public class P40 {
    public static void main(String[] args) {
        int[] nums = {4, 2, 3};

        System.out.println(canBeNonDecreasing(nums));
    }

    public static boolean canBeNonDecreasing(int[] nums) {
        int count = 0; // count of modifications

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (count > 1) {
                    return false;
                }

                // Decide whether to decrease nums[i] or increase nums[i+1]
                if (i == 0 || nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i + 1];  // lower nums[i]
                } else {
                    nums[i + 1] = nums[i];  // raise nums[i+1]
                }
            }
        }
        return true;
    }
}
