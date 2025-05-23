//WAP to find whether string is palindrome or not.

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 ="";
        for(int i=s1.length()-1; i>=0;i--){
            s2 = s2 + s1.charAt(i);
        }
        if(s1.equals(s2)){
            System.out.println("String is palindrome"); 
        }
        else{
            System.out.println("String is not palindrome");
        }


        /////////////// OR Using String Builder
    
        StringBuilder sb = new StringBuilder(s1);
        String rev = sb.reverse().toString();
        if(s1.equals(rev)){
            System.out.println("Palindrome");

        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
