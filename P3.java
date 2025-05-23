//WAP to find a Factor of a given number (iterative and recursive)

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // ----------------> iterative
        System.out.println("==========Iterative===============");
        for(int i=1 ; i<=n ; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        
        // -----------------> recurive
        findFactor(n, 1);
        System.out.println("==========Recursive===============");
        
    }
    public static void findFactor(int n, int i) {
        if(i>n) return;

        if(n%i==0) System.out.println(i); 
        
        findFactor(n, i+1);
    }
  
}
