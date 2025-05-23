// WAP to find a quotient and reminder of 2 number 
// (bigger number should be divided bylower number) 
// and you are not allowed to use a division and quotient operator.

import java.util.Scanner;

public class P29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a :");
        int a = sc.nextInt();

        System.out.println("Enter b :");
        int b = sc.nextInt();

        int divided = Math.max(a, b);
        int divisor = Math.min(a, b);

        int quotient=0;

        while(divided >= divisor){
            divided-=divisor;
            quotient++;
        }

        int remainder=divided;
        
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
