import java.util.HashMap;
import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class P61 {
    static HashMap<Integer, Integer> map = new HashMap<>();

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

        countNode(root);

        findMaxOccurrence();
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

    public static void countNode(TreeNode root) {
        if (root == null) {
            return;
        }
        countNode(root.left);
        int data = root.data;
        map.put(data, map.getOrDefault(data, 0) + 1); // Corrected here
        countNode(root.right);
    }

    public static void findMaxOccurrence() {
        int maxCount = 0;
        int maxValue = -1;

        for (int key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                maxValue = key;
            }
        }

        System.out.println("Node with maximum occurrence: " + maxValue);
        System.out.println("It occurred " + maxCount + " times.");
    }
}
