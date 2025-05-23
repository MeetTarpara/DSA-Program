// 52 Given a non-negative integer x, compute and return the square root of x.
// Since the return type is an integer, the decimal digits are truncated, and only the integer part
// of the result is returned.
// Note: You are not allowed to use any built-in exponent function or operator, such as pow(x,
// 0.5) or x ** 0.5.



import java.util.Scanner;

public class P52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Square root = " + sqrt(x));
        sc.close();
    }

    public static int sqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int low = 1, high = x;
        int ans = 0;

        while (low <= high) {
            int mid =( low + high )/ 2;

            if (mid <= x / mid) { // to prevent mid*mid overflow if mid^2 <= x without overflow (safer than mid * mid).
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}