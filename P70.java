import java.util.Scanner;

public class P70 {

    // Function to check if binary representation has consecutive 1's
    public static boolean hasConsecutiveOnes(int num) {
        // Shift the number to the right and check
        return (num & (num >> 1)) != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 0; i <= n; i++) {
            if (!hasConsecutiveOnes(i)) {
                count++;
            }
        }

        System.out.println("Number of integers without consecutive 1's: " + count);

        sc.close();
    }
}