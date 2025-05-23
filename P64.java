import java.util.Scanner;

public class P64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of steps (n): ");
        int n = sc.nextInt();
        System.out.println("Number of ways to climb = " + climbStairs(n));
        sc.close();
    }

    //just like fibbonaci series
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1; // Only 1 way to stay at ground or reach first step
        }

        int first = 1;  // Ways to reach step 0
        int second = 1; // Ways to reach step 1
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        return result;
    }
}
