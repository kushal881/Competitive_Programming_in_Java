package LinkedList;

//public class Reverse {
//    public static void ReverseD(Node head){
//        if(head==null) return;
//        ReverseD(head.next);
//        System.out.print(head.data+" ");
//    }
//    public static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//        }
//    }
//
//    public static void main(String[] args) {
//        Node a = new Node(3);
//        Node b = new Node(5);
//        Node c = new Node(8);
//        Node d = new Node(2);
//        Node e = new Node(4);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        ReverseD(a);
//    }
//}





//public class Reverse {
//    public static Node ReverseD(Node head){
//        if(head.next==null) return head;
//        Node newHead  =ReverseD(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }
//    public static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//        }
//    }
//
//    public static void main(String[] args) {
//        Node a = new Node(3);
//        Node b = new Node(5);
//        Node c = new Node(8);
//        Node d = new Node(2);
//        Node e = new Node(4);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        System.out.println(ReverseD(a).data);
//    }
//}


//                               BETTER TIME AND SPACE COMPLEXITY

public class Reverse {
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static Node ReverseD(Node head){
        Node curr = head;
        Node prev = null;
        Node agla = null;
        while(curr!=null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        Node k = ReverseD(a);
        System.out.println();
        display(k);
    }
}
