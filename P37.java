//WAP to sort a number in ascending order in singly linked list. 

public class P37{

    public static void main(String[] args) {
        LinkList l = new LinkList();

        Node first = null;
        first = l.insert(first, 1);
        first = l.insert(first, 2);
        first = l.insert(first, 4);
        first = l.insert(first, 3);

        System.out.println("Original Linked List:");
        l.printLL(first);

        l.sortLL(first);

        System.out.println("Sorted Linked List:");
        l.printLL(first);
    }
}
 class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 class LinkList {
    // static Node head = null;  // 👉 head made static, global to class

    // // Function to insert node at end
    // static void insert(int data) {
    //     Node newNode = new Node(data);
    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }

    //     Node temp = head;
    //     while (temp.next != null)
    //         temp = temp.next;

    //     temp.next = newNode;
    // }

    public Node insert(Node first, int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return first;
        }
        Node temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return first;
    }

    public void printLL(Node first) {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next; 
        }
        System.out.println("null");
    }

    public void sortLL(Node head) {
        if (head == null)
            return;

        // Bubble Sort on Linked List
        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.data > j.data) {
                    // Swap data
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }
    
    public Node insertSorted(Node first, int data) {
        Node newNode = new Node(data);

        // If the list is empty or new node should be first
        if (first == null || data < first.data) {
            newNode.next = first;
            first = newNode;
            return first;
        }

        // Find the correct position to insert
        Node current = first;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        // Insert node
        newNode.next = current.next;
        current.next = newNode;

        return first;
    }
}