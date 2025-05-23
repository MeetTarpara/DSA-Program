import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter Kth :");
        int k=sc.nextInt();

        List<Integer> distances = new ArrayList<>();

        // Find all pair distances
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                distances.add(Math.abs(nums[i] - nums[j]));
            }
        }

        // Sort the distances
        Collections.sort(distances);

        System.out.println("Kth Distance is :" + distances.get(k-1));

    }
}
