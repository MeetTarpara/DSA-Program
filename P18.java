//Selection Sort
//  --> Find minimum element index and replace with the element at the current index

// Case	Time Complexity	Explanation
// Best 	O(n²)	
// Average	O(n²)	
// Worst	O(n²)

import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0 ;i<a.length ;i++){
            a[i] = sc.nextInt();
        }

        int min_ind=0;
        for(int i=0 ;i<n-1 ; i++){
            min_ind=i;
            for(int j=i+1; j<n ;j++){
                if(a[min_ind]>a[j]) min_ind = j;
            }
            int temp = a[min_ind];
            a[min_ind]=a[i];
            a[i]=temp;
        }

        System.out.println("Sorted array:");
        for (int num : a) {
            System.out.print(num + " ");
        }

    }
}
