package LinkedList;

public class DeepCopy {
    public static void Display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static Node Deepcopy(Node head){
        Node copy = new Node(-1);
        Node temp = copy;
        while(head!=null){
            temp.next = head;
            head = head.next;
            temp = temp.next;
        }
        copy = copy.next;
        return copy;
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
       Node c = new Node(99);
       Node d = new Node(101);
        a.next = b;
        b.next = c;
        c.next = d;
        Node k = Deepcopy(a);
        Display(k);
    }
}
