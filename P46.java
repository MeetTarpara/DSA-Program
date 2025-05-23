
public class P46 {
    public static void main(String[] args) {
        decimalToOctal(10);
        octalToDecimal(12);
       
    }


    // Octal -> Decimal
    public static void octalToDecimal(int n){
        double ans=0;
        int base=1;

        while(n>0){
            ans += n%10*base;
            base*=8;
            n/=10;
        }
        System.out.println("Octal to Decimal :" +ans);
    }


    // Decimal -> Octal
    public static void decimalToOctal(int n){
        String ans = "";

        while(n>0){
            ans = (n%8) + ans;
            n=n/8;
        }
        System.out.println(" Decimal To Octal : "+ans);
    }


}
