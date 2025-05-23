// Sum of even number in array
import java.util.*;

public class P1{
    public static void main(String[] args ){
        System.out.println("Enter Array :");
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int sum =0;
        for(int i=0 ; i< a.length; i++){
            a[i]=sc.nextInt();
        }

        for(int i=0 ;i<a.length; i++){
            if(a[i]%2==0){
                sum=sum+a[i];
            }
        }
        System.out.println("Sum of even number in array is : "+sum);

    }
}