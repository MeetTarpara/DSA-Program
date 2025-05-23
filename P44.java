// Octal TO HexaDecimal
// octal-base_8 || HexaDecimal-base_16
//  i) Octal to Decimal (8-10)
// ii) Decimal to HexaDecimal (10-16)

import java.util.Scanner;

public class P44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Octal Number:");
        int n = sc.nextInt();

        // Call octalToDecimal -> Convert Octal to Decimal
        int decimal = octalToDecimal(n);

        // Call decimalToHexadecimal -> Convert Decimal to Hexadecimal
        decimalToHexadecimal(decimal);
    }

    // Function to convert octal number to decimal
    public static int octalToDecimal(int n) {
        int ans = 0;
        int base = 1; // 8^0
        while (n > 0) {
            int lastDigit = n % 10;
            ans += lastDigit * base;
            base *= 8;
            n /= 10;
        }
        return ans;
    }

    // Function to convert decimal to hexadecimal
    public static void decimalToHexadecimal(int n) {
        // Check if the number is 0
        if (n == 0) {
            System.out.println("0");
            return;
        }

        String result = "";

        // Convert the decimal number to hexadecimal
        while (n > 0) {
            int remainder = n % 16;
            if (remainder < 10) {
                result = remainder + result; // For 0-9, just append the digit
            } else {
                result = (char) ('A' + remainder - 10) + result; // For 10-15, append A-F
            }
            n /= 16;
        }

        System.out.println("Hexadecimal: " + result);
    }
}
