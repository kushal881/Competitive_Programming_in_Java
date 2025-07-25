package LinkedList;

public class MaxTwinSum {
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


    public static int MaxSum(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next.next!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        Node temp = ReverseD(slow.next);
        slow.next = temp;
        Node p1 = head;
        Node p2 = slow.next;
        int c = -2;
       while(p2!=null){
           int a = p1.data + p2.data;
           if(a>c){
               c=a;
           }
           p1 = p1.next;
           p2 = p2.next;
       }
       return c;
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(10);
        Node c = new Node(13);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        System.out.println(MaxSum(a));
    }
}
