
import java.util.Scanner;


//WAP to find whether a number is Odd or Even without using a % operator
public class P9 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        if((n & 1)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
