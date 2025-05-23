import java.util.Scanner;

public class P71 {

    public static int findTargetSumWays(int[] nums, int target) {
        return calculate(nums, 0, 0, target);
    }

    private static int calculate(int[] nums, int index, int currentSum, int target) {
        // Base case: all numbers are used
        if (index == nums.length) {
            if (currentSum == target) {
                return 1; // found one valid way
            } else {
                return 0; // not valid
            }
        }

        // Try adding nums[index]
        int add = calculate(nums, index + 1, currentSum + nums[index], target);

        // Try subtracting nums[index]
        int subtract = calculate(nums, index + 1, currentSum - nums[index], target);

        // Total ways
        return add + subtract;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target:");
        int target = sc.nextInt();

        int result = findTargetSumWays(nums, target);
        System.out.println("Number of ways: " + result);

        sc.close();
    }
}