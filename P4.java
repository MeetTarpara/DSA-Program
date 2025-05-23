
import java.util.Scanner;

//WAP to find a factorial of a given integer (iterative and recursive)

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // ----------------> Iterative
        int ans =1;
        for(int i=n; i>0 ;i--){
            ans = ans*i;
        }
        System.out.println("--->Itrative : "+ans);

        // ----------------> Iterative
        int ans1 = fact(n);
        System.out.println("--->Recursive : "+ans1);
    }
    public static int fact(int n) {
        if(n<=1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
