
// WAP to enter an element at specific position into array. (Do not take a new array) 

import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter MAX size of array:");
        int maxSize = sc.nextInt();
        int[] a = new int[maxSize]; 

        System.out.println("Enter Number of element to be stored in the array:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter New Element : ");
        int newElement = sc.nextInt();

        System.out.println("Enter Index for new Element :");
        int index = sc.nextInt();

        if(n>maxSize || index < 0 || index > n){
            System.out.println("New Element can't Insert");
        }
        else{
          for(int i=n ; i>index ; i--){
            a[i]=a[i-1];
          }
          a[index]=newElement;
          n++;
        }

        System.out.println("Result array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
