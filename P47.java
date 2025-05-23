public class P47 {
    public static void main(String[] args) {
        decimalToHexadecimal(41252);
        hexaDecimalToDecimal("A124");
    }

    public static void hexaDecimalToDecimal(String s){
        int n = s.length()-1;
        double ans=0;
        int base = 1;

        while(n>=0){
            char c = s.charAt(n);
            int digit;
            if(c >= '0' && c <= '9'){
                digit = c  - '0';
            }
            else{
                digit = c - 'A'+10;
            }
            ans += digit*base;
            base*=16;
            n--;
        }
        System.out.println("Decimal : " + ans);
    }

    public static void decimalToHexadecimal(int n){
        String ans = "";
        if (n == 0) {
            System.out.println("0");
            return;
        }

        while(n>0){
            int remainder = n%16;
            if(remainder<10){
                ans = remainder+ ans;
            }
            else{
                ans = (char)( 'A' + remainder - 10) + ans;
            }
            n/=16;
        }
        System.out.println("HexaDecimal : " +ans);


    }
}
