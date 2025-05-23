//WAP to find a Multiplication of 2 Matrix (dimension and value should be entered by user)

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter r1 :");
        int r1 = sc.nextInt();
        
        System.out.println("enter c1 :");
        int c1 = sc.nextInt();

        System.out.println("Enter c2 :");
        int c2 = sc.nextInt();

        int[][] a = new int[r1][c1];
        int[][] b = new int[c1][c2];

        int[][] c = new int[r1][c2];

        System.out.println("Enter elements of Matrix A:");
        for(int i=0 ;i<r1;i++){
            for(int j=0 ;j<c1 ;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for(int i=0 ;i<c1;i++){
            for(int j=0 ;j<c2 ;j++){
                b[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
