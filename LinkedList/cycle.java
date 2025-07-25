package LinkedList;

//public class cycle {
//    public static boolean Cycle(Node head){
//        if(head.next==null || head == null) return false;
//        Node fast = head;
//        Node slow = head;
//        while(fast!=null){
//            if(slow==null) return false;
//            slow = slow.next;
//            if(fast.next == null) return false;
//            fast = fast.next.next;
//            if(fast==slow)  return true;
//        }
//        return false;
//    }
//    public static class Node{
//        int data;
//        Node next;
//        Node (int data){
//            this.data = data;
//        }
//    }
//
//    public static void main(String[] args) {
//        Node a = new Node(3);
//        Node b = new Node(2);
//        Node c = new Node(0);
//        Node d = new Node(4);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = b;
//        System.out.println(Cycle(a));
//    }
//}




public class cycle {
    public static int Cycle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow)  break;
        }
        Node temp = head;
        while(temp!=slow){
            slow = slow.next;
            temp = temp.next;
        }
        return slow.data;
    }
    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = c;
        System.out.println(Cycle(a));
    }
}
