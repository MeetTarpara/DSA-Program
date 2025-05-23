//WAP to convert a Binary to Decimal.

import java.util.Scanner;

public class P26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number:");
        int n = sc.nextInt();
        String x  = Integer.toString(n);
        double ans = 0;
        for(int i= x.length()-1 ; i>=0 ;i-- ){
            char c = x.charAt(i);
            if(c=='0'){
                ans = ans + 0;
            }
            else{
                ans = ans + Math.pow(2, x.length()-i-1);
            }
        }
        System.out.println("Answer is : " + ans);


        int base=1;
        double ans2=0;
        while(n>0){
            int ld =n%10;
            ans2 += ld*base;
            base*=2;
            n/=10;
        }
         System.out.println("Answer is ----: " + ans2);
    }
}
