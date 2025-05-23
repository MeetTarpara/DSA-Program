import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class P35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of 1st array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter 1st array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Enter size of 2st array: ");
        int m = sc.nextInt();
        int[] b = new int[m];

        System.out.println("Enter 2st array elements:");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int ans[]=intersect(a, b);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        sc.close();
      
    }

    public static int[] intersect(int[] a, int[] b){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : a){
            map.put(i,  map.getOrDefault(i, 0) + 1 ) ;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i : b ){
            if(map.containsKey(i) && map.get(i)>0){
                list.add(i);
                map.put(i, map.get(i)-1);
            }
        }

        int[] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i] = list.get(i);
        }
        return ans;

    }


    public static int[] intersectWithoutmap(int nums1[],int nums2[]){
       
            // Step 1: Find intersection and store in temp array
            int[] temp = new int[Math.min(nums1.length, nums2.length)];
            int k = 0; // Index for temp array

            // Create a visited array to mark used elements in nums2
            int[] visited = new int[nums2.length]; // default all 0

            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i] == nums2[j] && visited[j] == 0) {
                        temp[k] = nums1[i];
                        k++;
                        visited[j] = 1; // mark as used
                        break;
                    }
                }  
            }

            // Step 2: Sort the intersection array (simple Bubble Sort)
            for (int i = 0; i < k - 1; i++) {
                for (int j = 0; j < k - i - 1; j++) {
                    if (temp[j] > temp[j + 1]) {
                        // Swap
                        int t = temp[j];
                        temp[j] = temp[j + 1];
                        temp[j + 1] = t;
                    }
                }
            }
            return temp;
    }
}
