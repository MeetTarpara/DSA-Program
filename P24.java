import java.util.Scanner;

public class P24 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter MAX size of array:");
        int maxSize = sc.nextInt();
        int[] a = new int[maxSize]; 

        System.out.println("Enter Number of element to be stored in the array:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter Element for Delete: ");
        int delete = sc.nextInt();

        boolean isDelete = false;

        for(int i=0 ;i<n;i++){
            if (a[i] == delete){
                isDelete=true;
                for(int j=i ; j<n-1 ; j++){
                    a[j]=a[j+1];
                }
                a[n-1]=0;//for handaling last Element from exception 
                // Or at print time only print for n tiome in for loop -- for i=0 -> i=n
                n--;
                break;
            }

        }

        if(isDelete){
            System.out.println("Result Deleted array:");
            for (int num : a) {
                System.out.print(num + " ");
            }
            
             // Or at print time only print for n tiome in for loop -- for i=0 -> i=n
            System.out.println("Array after deletion:");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
        else{
            System.out.println("No element found");
        }
    }
}
