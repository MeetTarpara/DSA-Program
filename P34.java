// Print a Leaf Nodes in Binary search tree.

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class P34 {

    // Function to insert a new node in BST
    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // Function to print leaf nodes
    public static void printLeafNodes(Node root) {
        if (root == null)
            return;

        // If node is a leaf node
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }

        // Otherwise recur for left and right subtree
        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }

    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 50);
        insert(root, 30);
        insert(root, 20);
        insert(root, 40);
        insert(root, 70);
        insert(root, 60);
        insert(root, 80);

        System.out.println("Leaf nodes of BST are:");
        printLeafNodes(root);
    }
}
