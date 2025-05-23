//WAP to find a power a^b (without using power and multiplication operation)

import java.util.Scanner;

public class P20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter base (a): ");
        int a = sc.nextInt();
        System.out.print("Enter exponent (b): ");
        int b = sc.nextInt();
        

        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = multiply(result, a);
        }

        System.out.println("Result: " + result);
    }

    // Multiply two numbers using only addition
    static int multiply(int x, int y) {
        int result = 0;
        for (int i = 1; i <= y; i++) {
            result += x;
        }
        return result;
    }
}
