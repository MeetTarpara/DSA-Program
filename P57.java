// Write a Function that returns either 1 or 0 based on following condition if the array is in
// ascending order and occurrence of that number at least 3 then it should return 1 otherwise
// it should return 0.
// e.g.
// if A=[1,1,1,2,2] it should return 0
// if A=[1,1,1,3,3,3,3] it should return 1
// if A=[2,2,2,1,1,1] it should return 0

import java.util.Scanner;

public class P57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter Element :");
        for(int i=0 ;i<a.length ;i++){
            a[i]= sc.nextInt();
        }
        if(isTrue(a)){
            System.out.println("All conditions are True - 1");
        }
        else{
            System.out.println("Some Condition False - 0");
        }

    }

    public static boolean isTrue(int[] a) {
        // Check if array is in ascending order
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }

        // Now check if every number appears at least 3 times
        int i = 0;
        while (i < a.length) {
            int count = 1;
            int j = i + 1;
            while (j < a.length && a[j] == a[i]) {
                count++;
                j++;
            }
            if (count < 3) {
                return false;
            }
            i = j; // move to next new element
        }

        return true;
    }
    
}
