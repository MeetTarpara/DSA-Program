//WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value
//should be taken from user (Note that you are not allowed to use an array for this)



import java.util.Scanner;
public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, max, min, sum= 0;
        double avg=0.0;       
        max = 0;      
        min = Integer.MAX_VALUE;
        
        System.out.println("Enter the number of elements (n) :");
        n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter Array:");

        for(int i=0; i<n ;i++){
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum=sum+a[i];
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        avg = sum / n;

        System.out.println("Max: " + max + ", Min: " + min + ", Average: " + avg);
        System.out.println("Sum :" +sum);
    }
}
