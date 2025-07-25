package LinkedList;

public class RDuplicateElement {
    public static void Duplicate(Node head){
        Node temp = head;
        while(temp!=null){
           if(temp.next.data==temp.data){
                temp.next= temp.next.next;
            }
            if(temp.next==null) break;
            if(temp.next.data!=temp.data){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
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
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(2);
        Node e = new Node(3);
        Node f = new Node(3);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next = f;
        Duplicate(a);
    }
}
