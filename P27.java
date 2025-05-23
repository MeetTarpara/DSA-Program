// Counting Sort
// Best 	O(n+k)	-->k is the range of input
// Average 	O(n+k)
// Worst 	O(n+k)	-->k is the range of input


import java.util.Scanner;

public class P27 {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        countingSort(a);
        for (int i : a) {
            System.out.print(i+" ");
        }
        sc.close();
    }
    
    public static void countingSort(int[] arr) {
        int n = arr.length;

        // Find the maximum value in the array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create a count array to store frequency of each value
        int[] count = new int[max + 1];

        // Store the count of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Build the sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}