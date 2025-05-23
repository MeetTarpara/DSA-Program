class DblNode{

    int data;
    DblNode lptr,rptr;

    public DblNode(int data){
        this.data=data;
        lptr=rptr=null;
    }
}


class DblLinkedList{
    public static DblNode head;

    public void insertNode(int data){
        DblNode node = new DblNode(data);

        if(head==null){
            head=node;
        }
        else{
            DblNode temp = head;
            while(temp.rptr!=null){
                temp = temp.rptr;
            }
            temp.rptr=node;
            node.lptr=temp;

        }
    }

    public void printForward() {
        System.out.print("Forward: ");
        DblNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.rptr;
        }
        System.out.println();
    }



    public void splitEvenOddList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
    
        DblNode evenHead = null, evenTail = null;
        DblNode oddHead = null, oddTail = null;
    
        DblNode temp = head;
        
        while (temp != null) {
            DblNode newNode = new DblNode(temp.data);
    
            if (temp.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = evenTail = newNode;
                } else {
                    evenTail.rptr = newNode;
                    newNode.lptr = evenTail;
                    evenTail = newNode;
                }
            } else {
                if (oddHead == null) {
                    oddHead = oddTail = newNode;
                } else {
                    oddTail.rptr = newNode;
                    newNode.lptr = oddTail;
                    oddTail = newNode;
                }
            }
    
            temp = temp.rptr; // move to next node
        }
    
        // Print Even List
        System.out.print("Even List: ");
        temp = evenHead;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.rptr;
        }
        System.out.println();
    
        // Print Odd List
        System.out.print("Odd List: ");
        temp = oddHead;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.rptr;
        }
        System.out.println();
    }
    

    public void splitDblLinkedList() {
        if (head == null || head.rptr == null) {
            System.out.println("Cannot split, list too small.");
            return;
        }
    
        DblNode slow = head;
        DblNode fast = head;
    
        // Move fast by 2 and slow by 1
        while (fast.rptr != null && fast.rptr.rptr != null) {
            slow = slow.rptr;
            fast = fast.rptr.rptr;
        }
    
        // Now, slow is at middle
        DblNode head1 = head;          // first half
        DblNode head2 = slow.rptr;      // second half
    
        // Break the link between two halves
        slow.rptr = null;
        if (head2 != null) {
            head2.lptr = null;
        }
    
        // Print First Half
        System.out.print("First Half: ");
        DblNode temp = head1;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.rptr;
        }
        System.out.println();
    
        // Print Second Half
        System.out.print("Second Half: ");
        temp = head2;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.rptr;
        }
        System.out.println();
    }
    
}

public class P59 {
    public static void main(String[] args) {
        DblLinkedList list = new DblLinkedList();
        list.insertNode(10);
        list.insertNode(20);
        list.insertNode(30);
        list.insertNode(40);

        list.printForward();   // Output: Forward: 10 20 30 40
         // O
        list.splitEvenOddList();
        list.splitDblLinkedList();
    }
}
