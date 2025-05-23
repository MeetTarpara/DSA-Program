// Write a program to check weather number is happy number is not, happy number are those
// number whose digit’s square summation eventually reaches to 1, if the sequence start
// repeating then it is not a happy number, to store this sequence, use a dynamic data structure.
// E.g., 49 is a happy number whose sequence is 49 97 130 10 1
// E.g., 50 is not a happy number whose sequence is 50 25 29 85 89 145 42 20 4 16 37 58 89
// it should stop when 89 is detected 2nd time and print 50 is not a happy number. 

import java.util.HashSet;
import java.util.Scanner;

public class P58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (isHappy(n)) {
            System.out.println(n + " is a Happy Number!");
        } else {
            System.out.println(n + " is NOT a Happy Number!");
        }
        
        sc.close();
    }

    public static boolean isHappy(int n){
        HashSet<Integer> set = new  HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            n = getSumOfSquares(n);
        }
        return true;
    }

     // Function to calculate sum of squares of digits
     public static int getSumOfSquares(int n) {
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10;   // get last digit
            sum += digit * digit; // add square of digit
            n /= 10;              // remove last digit
        }
        
        return sum;
    }
}
