
// Given an array of N integers, and an integer K, find the number of pairs of elements in the
// array whose sum is equal to K.
// e.g.
// Input:
// N = 4, K = 6
// arr[] = {1, 5, 7, 1}
// Output: 2
// Explanation:
// arr[0] + arr[1] = 1 + 5 = 6
// and arr[1] + arr[3] = 5 + 1 = 6.


import java.util.Arrays;
import java.util.Scanner;

public class P43 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter element :");
        for(int i=0 ;i<a.length ;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Sum K :");
        int k = sc.nextInt();

        int count = 0;

        Arrays.sort(a);

        for(int i = 0 ; i < a.length ; i++ )
        {
            if(a[i]<k){
                for(int j = i+1; j < a.length ; j++){
              
                    if(a[i]+a[j] == k && i!=j){
                        count++;
                    }
                }
            }
        }
        System.out.println("Count :" +count);
    }
}
