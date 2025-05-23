//WAP to find a summation of a digit of a given number. (Iterative and recursive)

import java.util.Scanner;
 
public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int m=n;

        // -----------> Iterative
        int sum = 0;
        while(n>0){
            sum = sum + n%10;
            n=n/10;
        }
        System.out.println("--->Itrative : "+sum);

        // -----------> Recursive
        int sum2 = digitsum(m);
        System.out.println("--->Recursuive : "+sum2);
    }

    public static int digitsum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n%10 + digitsum(n/10);
        }
    }
}
