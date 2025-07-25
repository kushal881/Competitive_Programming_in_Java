package LinkedList;

public class intersection {
    public static void Intersection(Node head1,Node head2){
        Node t1 = head1;
        Node t2 = head2;
        int count1 = 0;
        int count2 = 0;
        while(t1!=null){
            count1++;
            t1=t1.next;
        }
        while(t2!=null){
            count2++;
            t2 = t2.next;
        }
        t1=head1;
        t2=head2;
        if(count1>count2){
            for(int i=1;i<=count1-count2;i++) {
                t1 = t1.next;
            }
        }
        else if(count2>count1){
            for(int i=1;i<=count2-count1;i++) {
                t2 = t2.next;
            }
        }
        while(t1!=null){
            if(t1.data==t2.data){
                System.out.print(t1.data+" ");
            }
            t1=t1.next;
            t2=t2.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
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
        Node i = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = i;
        Node g = new Node(90);
        Node h = new Node(9);
        Node j = new Node(5);
        Node k = new Node(12);
        Node l = new Node(10);
        Node m = new Node(6);
        g.next = h;
        h.next = j;
        j.next = k;
        k.next = l;
        l.next = m;
        Intersection(a,g);
    }
}
