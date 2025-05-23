// WAP to convert a Decimal number to BCD
// --> BCD
// --> Binary
// --> Binary Using Bitwise(&,>>) 
// --> Binary to Decimal (P26 program)

import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No : ");
        int n = sc.nextInt();
        int m =n;

        String bcd = "";

        //bcd
        while (n > 0) {
            bcd = bcd(n % 10)+" "+bcd;           
            n /= 10;
        }

        System.out.println("BCD : " +bcd);


        
        //binary
        String binaryNo = binary(m);
        System.out.println("Binnary :"+ binaryNo);

        //binary using bitwise
        binaryUsingBitwise(m);

    }

    //------------------------------> BCD Function
    public static String bcd(int n){
        String result="";
        while (n > 0) {
            if(n%2==0) result = "0" + result;
            else result = "1" + result;
            
            n /= 2;
        }
        while(result.length()!=4){
            result = "0" + result;
        }
        return result;
    }

    //------------------------------> Binary Function
    public static String binary(int n){
        String result = "";
        while(n>0){
            if(n%2==0) result= "0" + result;
            else result = "1" + result;
            n /= 2;
        }
        
        return result;
    }


    //------------------------------> Binary Usding Bitwise (&,>>)
    public static void binaryUsingBitwise(int n) {
        String result = "";

        while(n>0){
            int bit = n&1; // similar to n%2
            result = bit + result; 
            n = n>>1; // similar to n=n/2
        }
        System.out.println("BInary using BitWise : "+result);
    }
}
