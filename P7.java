//WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive)

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();

        // ------------> Iterative

        System.out.print(" -------> Iterative :" );
        int a=0;
        int b=1;

        for(int i=0;i<n;i++){
            System.out.print(" " + a );
            int next = a+b;
            a=b;        
            b=next;    
        }
        System.out.println(" ");

        // ------------> Recursive

        System.out.print(" -------> Recursive :");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + fibonacci(i));
        }

    }
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
