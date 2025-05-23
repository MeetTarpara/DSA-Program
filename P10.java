// WAP to find a prime number between range (range should be entered by user).

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1 :");
        int n1 = sc.nextInt();
        System.out.println("Enter n2:");
        int n2 = sc.nextInt();
        
        
        for(int i=n1 ;i<n2 ; i++){
            int c=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    c=1;
                }
            }
            if(c==0){
                System.out.println(" "+i);
            }
        }
    }
}
