//8 WAP to find a total odd and total even digit of a given number

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int c1=0;
        int c2=0;

        while(n>0){
            int x = n%10;
            if(x%2==0){
                c1++;
            }
            else{
                c2++;
            }
            n=n/10;
        }
        System.out.println("Even digits: " + c1);
        System.out.println("Odd digits: " + c2);

    }
}
