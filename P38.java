public class P38 {
    public static void main(String[] args) {
        LinkList l = new LinkList();
        Node first=l.insertSorted(null, 0);
        l.insertSorted(first, 4);
        l.insertSorted(first, 3);
        l.insertSorted(first, 9);
        l.printLL(first);
    }
}
