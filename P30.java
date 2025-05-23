//Decimal to Binary

import java.util.Scanner;

public class P30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number:");
        int n = sc.nextInt();

        String ans = "";

        while (n>0) { 
            if(n%2==0) ans = "0"+ans;
            else ans= "1"+ans;
            n=n/2;
        }
        System.out.println("Answer : " +ans);

    }
}
