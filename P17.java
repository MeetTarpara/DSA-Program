// Insertion Sort
// --> taking an element from the unsorted portion and inserting it into the correct position in the sorted portion.
// --> 2 portion   Sorted Array || Unsorted Array 

// Best 	O(n)	
// Average	O(n²)	
// Worst	O(n²)	


import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0 ;i<a.length ;i++){
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j=i-1;
            while (j >= 0 && a[j] > current) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }

        System.out.println("Sorted array:");
        for (int num : a) {
            System.out.print(num + " ");
        }


    }
}
