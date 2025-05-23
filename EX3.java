
//ArrayLeaders
// This program finds and prints all the leaders in an array.
// A leader is an element that is greater than all the elements to its right.
// For example, in the array {16, 17, 4, 3, 5, 2}, the leaders are 17 and 5.
// The last element is always a leader.
public class EX3 {

    public static void printLeaders(int[] arr) {
        int n = arr.length;
        int maxFromRight = arr[n - 1]; // Last element is always a leader
        System.out.print("Leaders: " + maxFromRight + " ");

        // Traverse from second last to first
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        printLeaders(arr);
    }
}
