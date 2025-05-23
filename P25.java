// WAP to check weather number is present in array or not (using recursion only) and the
// function’s syntax is given below
// Int isInArray(int a[],int m);
// Where int a[] is Array of integer and m is element to be searched. 

import java.util.Scanner;

public class P25 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0 ;i<a.length ;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to search in array :");
        int x = sc.nextInt();

        if(isFound(a,x,0)==1){
            System.out.println("Element is Found in Array");
        }
        else{
            System.out.println("Element is not Found in Array");
        }
    }

    public static int isFound(int a[], int x, int ind){
        if(ind==a.length){
            return 0;
        }
        else if(a[ind]==x){
            return 1;
        }
        return isFound(a, x, ind+1);
    }
}
