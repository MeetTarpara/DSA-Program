// WAP to implement a sliding window problem. You are given an array of integers nums,
// there is a sliding window of size k which is moving from the very left of the array to the
// very right. You can only see the k numbers in the window. Each time the sliding window
// moves right by one position.
// Input: nums = [1,3, -1, -3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7] --> max_ele_arr from each window

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P42 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter element :");
        for(int i=0 ;i<a.length ;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Window Size K :");
        int k = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i=0 ; i<n-k+1 ; i++){
            int max=a[i];
            
            for(int j=i ; j<i+k ; j++ ){
                if(a[j] > max){
                    max=a[j];

                }
                
            }
            list.add(max);
            
        }

        int[] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i] = list.get(i);
        }
        
        for(int i: ans){
            System.out.print(i + " ");
        }

    }
}
