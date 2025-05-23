//WAP to find weather given number is Armstrong number is not. 

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int m=n;
        int sum =0;

        int numDigits=0;
        while(m>0){
            numDigits++;
            m=m/10;
        }
        m=n;

        while(n>0){
            int digit = n % 10; // Extract the last digit of the number
            n /= 10; // Remove the last digit from the number
            sum += Math.pow(digit, numDigits);
        }
        if (sum == m) {
            System.out.println(m + " is an Armstrong number.");
        }
        else{
            System.out.println(m + " is not an Armstrong number.");
        }
    }
}
