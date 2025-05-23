// The average difference of the index i is the absolute difference between the average of the
// first i + 1 elements of nums and the average of the last n - i - 1 elements. Both averages should
// be rounded down to the nearest integer.
// Return the index with the minimum average difference. If there are multiple such indices,
// return the smallest one

import java.util.Scanner;

public class P56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter Element :");
        for(int i=0 ;i<a.length ;i++){
            a[i]= sc.nextInt();
        }

        System.out.println(minimumAvgDiff(a));

    }

    public static int minimumAvgDiff(int[] a){
        int totalsum=0;
        int  n = a.length;

        for(int i : a)totalsum+=i;

        int leftsum=0;
        int min_ind = -1;
        int min_diff = Integer.MAX_VALUE;

        for(int i=0; i<n ; i++){
            leftsum+=a[i];
            double left_avg = leftsum/(i+1);
            double right_avg = (i == n - 1) ? 0 : (totalsum - leftsum) / (n - i - 1);
            int diff = (int)Math.abs(left_avg-right_avg);

            if(diff<min_diff){
                min_diff=diff;
                min_ind=i;
            }

        }
        return min_ind;
    }
}
