//    1
//   A B
//  2 3 4
// C D D F


import java.util.Scanner;

public class P22_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int x=1;
        char c = 'A';
        for(int i=0 ;i<n ; i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i ; j++){
                if(i%2==0){
                    System.out.print(" "+x);
                    x++;
                }
                else{
                    System.out.print(" "+c);
                    c++;
                }
                
            }
            System.out.println("");
        }

    }
}
