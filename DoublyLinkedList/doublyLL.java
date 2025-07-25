package DoublyLinkedList;

public class doublyLL {
    public static void Display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void Display2(Node ran){
        Node temp = ran;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void Displayrev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head){
        Node t = new Node(30);
        t.next = head;
        head.prev=t;
        return t;
    }
    public static void insertAt(Node tail){
        Node t = new Node(30);
        while(tail!=null){
            if(tail.next==null){
                tail.next=t;
                t.next =  null;
                t.prev = tail;
            }
            System.out.print(tail.data+" ");
            tail = tail.next;
        }
    }
    public static void InsertAtIndex(Node head,int x){
        Node temp = head;
        int count = 1;
        Node t = new Node(30);
        while(temp!=null){
            if(count==x){
                temp.next.prev = t;
                t.prev = temp;
                t.next = temp.next;
                temp.next = t;
            }
            System.out.print(temp.data+" ");
            count++;
            temp=temp.next;
        }
    }

   public static void MaximaMinima(Node head){
        Node temp=head;
        int a;
        int b;
        while(temp.next!=null){
            if(temp.prev.data<temp.data  && temp.next.data<temp.data){
                a = temp.data;
            }
            else if (temp.data<temp.prev.data && temp.data<temp.next.data){
                b = temp.data;
            }
            temp=temp.next;
        }
    }

    public static class Node{
        int data;
        Node  next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a  = new Node(1);
        Node b  = new Node(2);
        Node c  = new Node(5);
        Node d  = new Node(3);
        Node e  = new Node(2);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        Display(a);
        Displayrev(e);
        Display2(d);
        Node k = insertAtHead(a);
//        Display(k);
//        insertAt(a);
        InsertAtIndex(a,3);
//        MaximaMinima(a);
    }
}
