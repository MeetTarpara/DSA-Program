import java.util.Scanner;

public class P68 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        int result = numSquares(n);
        System.out.println("Minimum number of perfect squares = " + result);
        
        sc.close();
    }

    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        
        dp[0] = 0; // 0 needs 0 squares
        
        for (int i = 1; i <= n; i++) {
            dp[i] = i; // maximum squares: 1+1+1+... (i times)

            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
            }
        }
        
        return dp[n];
    }
}
