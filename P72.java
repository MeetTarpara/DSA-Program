// You are given a 0-indexed array nums consisting of positive integers. You can choose two
// indices i and j, such that i != j, and the sum of digits of the number nums[i] is equal to that of
// nums[j].
// Return the maximum value of nums[i] + nums[j] that you can obtain over all possible indices
// i and j that satisfy the conditions.
// Input: nums = [18,43,36,13,7]
// Output: 54


import java.util.Scanner;

public class P72{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max_sum = 0;
        int x=0;

        for(int i = 0 ; i<n-1 ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(sumDigits(a[i]) == sumDigits(a[j])){
                   if(sumDigits(a[i]) + sumDigits(a[j]) >x){
                       max_sum =a[i] + a[j];
                       x=sumDigits(a[i]) + sumDigits(a[j]);
                   }
                }
            }
        }

        System.out.println("Maximum sum of digits: " + max_sum);
    }   

    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}