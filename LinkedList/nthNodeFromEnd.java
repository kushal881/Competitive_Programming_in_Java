package LinkedList;
//public class nthNodeFromEnd {
//    public static Node nthNode(Node head, int n) {
//        Node slow = head;
//        Node fast = head;
//        for (int i = 1; i <= n; i++) {
//            fast = fast.next;
//        }
//        while (fast != null) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//        return slow;
//    }
//    public static class Node {
//        int data;
//        Node next;
//        Node(int data) {
//            this.data = data;
//        }
//    }
//    public static void main(String[] args) {
//        Node a = new Node(100);
//        Node b = new Node(13);
//        Node c = new Node(4);
//        Node d = new Node(5);
//        Node e = new Node(12);
//        Node f = new Node(10);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = f;
//        Node q = nthNode(a, 2);
//        System.out.println(q.data);
//    }
//}

public class nthNodeFromEnd {
    public static void nthNodeRemove(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if(fast==null){
            head = head.next;
            System.out.print(head.data+" ");
            head = head.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        while(head!=null){
            if(slow==head.next){
                head.next=head.next.next;
            }
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        nthNodeRemove(a, 6);
    }
}




