//In a Given BST (Binary) search tree find the 2nd min value
import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class P51 {

    static int count = 0;
    static int secondMin = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeNode root = null;
        for (int value : arr) {
            root = insert(root, value);
        }

        findSecondMin(root);

        if (secondMin != -1) {
            System.out.println("Second Minimum Value = " + secondMin);
        } else {
            System.out.println("Tree doesn't have enough nodes.");
        }

        sc.close();
    }

    public static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void findSecondMin(TreeNode root) {
        if (root == null) {
            return;
        }

        // Inorder Traversal: left -> root -> right
        findSecondMin(root.left);

        count++;
        if (count == 2) {
            secondMin = root.data;
            return;
        }

        findSecondMin(root.right);
    }
}