// 53 Write a program to take 2 numbers from user and find out the distance between them.
// (How to compute distance: If number is 10 and 18 then 10 in binary 1010 and 18 in binary
// is 10010 and distance is 2 means total number of bits that needs to be changed when 10 is
// converted into 18 or 18 is converted into 10, do not convert the number into binary)



import java.util.Scanner;

public class P53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int xor = a ^ b; // XOR will have 1s where bits are different
        int count = 0;

        while (xor > 0) {
            if ((xor & 1) == 1) {
                count++;
            }
            xor = xor >> 1; // Right shift
        }

        System.out.println("Distance (number of bits different) = " + count);
        
        sc.close();
    }
}
