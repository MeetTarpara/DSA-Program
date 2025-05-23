// Bubble Sort
//   --> heavy element at the bottom of stack

// Best 	O(n)	
// Average	O(n²)	
// Worst	O(n²)



import java.util.*;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0 ;i<a.length ;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("You entered: " + Arrays.toString(a));
        
        for(int i=0 ;i <n-1 ; i++){
            for(int j=0 ;j<n-i-1 ;j++ ){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1]; 
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(a));

    }
}
