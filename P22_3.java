//   * * * * * * * * *
//   * * * *   * * * *
//   * * *       * * *
//   * *           * *
//   *               *


import java.util.Scanner;

public class P22_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        for(int i=0; i<n ;i++){
            for(int j=0;j<n-i; j++){
                System.out.print(" *");
            }

            int spaces = (i - 1) * 4 +1 ;
            for(int j=0; j<=spaces ;j++){
                System.out.print(" ");
            }
            int rightStars = (i == 0) ? n - i -1: n - i ; 
            for(int j=0;j<rightStars; j++){
                System.out.print( " *");
            }
            System.out.println("");
        }

    } 
}
