// Given an array, rotate the array to the right by k steps, where k is non-negative.
// Example 1:
// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 step to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]

import java.util.Scanner;

public class P39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter element :");
        for(int i=0 ;i<a.length ;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter K :");
        int k = sc.nextInt();

        int[] ans = new int[n];
        int index=0;
        for(int i=n-k;i<n;i++){
            ans[index++]=a[i];
        }
        for(int i=0; i<n-k ;i++){
            ans[index++]=a[i];
        }


        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
