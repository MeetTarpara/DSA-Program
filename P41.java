// You are given an integer num. Rearrange the digits of num such that its value is minimized
// and it does not contain any leading zeros.
// Return the rearranged number with minimal value.
// Note that the sign of the number does not change after rearranging the digits.
// Input: num = 310
// Output: 103
// Explanation: The possible arrangements for the digits of 310 are 013, 031, 103, 130, 301,
// 310.
// The arrangement with the smallest value that does not contain any leading zeros is 103.


//-------> Char_Arr -> String => String s = new String(digits);
//-------> String -> Char_arr => char[] x = s.toCharArray();
//-------> Integer -> String => String str = Integer.toString();
//-------> String -> Integer => int a = Integer.parseInt();
//-------> Integer -> String -> Char_Arr => Char[] digits = Integer.toString().toCharArray();
//-------> Char_Arr -> String -> Integer => Integer.parseInt(new String(digit))

import java.util.Arrays;
import java.util.Scanner;

public class P41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre a number : ");
        int n = sc.nextInt();
        System.out.println("The smallest number is : " + smallestNumber(n));
        sc.close();
    }

    public static int smallestNumber(int num){
        if (num == 0) return 0;

        boolean isNegative = num<0;

        char[] digits = Integer.toString(Math.abs(num)).toCharArray();

        Arrays.sort(digits);

        if(isNegative){
            reverse(digits);
            return -Integer.parseInt(new String(digits));
        }
        else{
            if(digits[0] == '0'){
                for(int i = 1; i< digits.length ; i++){
                    if(digits[i] != 0){
                        char temp = digits[0];
                        digits[0] = digits[i];
                        digits[i] = temp;
                        break;
                    }
                }
            } 
        }
        return Integer.parseInt(new String(digits));

    }

    public static void reverse(char[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
