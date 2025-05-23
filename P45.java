//WAP to convert a hexa-decimal to Octal.

import java.util.Scanner;

public class P45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hexadecimal Number:");
        String hex = sc.nextLine();

        // Convert Hexadecimal to Decimal
        int decimal = hexToDecimal(hex);

        // Convert Decimal to Octal
        String octal = decimalToOctal(decimal);

        System.out.println("Octal Number: " + octal);
    }

    // Function to convert Hexadecimal to Decimal
    public static int hexToDecimal(String hex) {
        int decimal = 0;
        int base = 1; // 16^0
        int length = hex.length();

        for (int i = length - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            int digit;
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else {
                digit = ch - 'A' + 10;
            }
            decimal += digit * base;
            base *= 16;
        }
        return decimal;
    }

    // Function to convert Decimal to Octal
    public static String decimalToOctal(int n) {
        if (n == 0) {
            return "0";
        }

        String octal = "";
        while (n > 0) {
            octal = n % 8+octal; // Append remainder at the front
            n /= 8;
        }

        return octal.toString();
    }
}
