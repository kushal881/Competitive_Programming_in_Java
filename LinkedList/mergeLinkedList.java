package LinkedList;

//public class mergeLinkedList {
//    public static void MergeLinkedList(Node head1, Node head2){
//        Node temp1 = head1;
//        Node temp2 = head2;
//        Node head = new Node(100);
//        Node temp = head;
//        while(temp1!=null && temp2!=null){
//              if(temp1.data<temp2.data){
//                  Node a = new Node(temp1.data);
//                  temp.next = a;
//                  temp = a;
//                  temp1 = temp1.next;
//              }
//            else{
//                Node a = new Node(temp2.data);
//                temp.next = a;
//                temp = a;
//                temp2 = temp2.next;
//            }
//        }
//        if(temp1==null){
//            temp.next = temp2;
//        }
//        else{
//            temp.next = temp1;
//        }
//        head=head.next;
//        while(head!=null){
//            System.out.print(head.data+" ");
//            head = head.next;
//        }
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
//        Node a = new Node(1);
//        Node b = new Node(3);
//        Node c = new Node(5);
//        Node d = new Node(8);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        Node g = new Node(2);
//        Node h = new Node(4);
//        Node j = new Node(6);
//        Node k = new Node(7);
//        g.next = h;
//        h.next = j;
//        j.next = k;
//        MergeLinkedList(a,g);
//    }
//}


//public class mergeLinkedList {
//    public static void MergeLinkedList(Node head1, Node head2){
//        Node t1 = head1;
//        Node t2 = head2;
//        Node h = new Node(100);
//        Node t = h;
//        while(t1!=null && t2 != null){
//            if(t1.data<t2.data){
//                t.next=t1;
//                t=t1;
//                t1 = t1.next;
//            }
//            else{
//                t.next =  t2;
//                t=t2;
//                t2=t2.next;
//            }
//        }
//        if(t1==null){
//            t.next = t2;
//        }
//        else{
//            t.next = t1;
//        }
//        h=h.next;
//        while(h!=null){
//            System.out.print(h.data+" ");
//            h=h.next;
//        }
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
//        Node a = new Node(1);
//        Node b = new Node(3);
//        Node c = new Node(5);
//        Node d = new Node(8);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        Node g = new Node(2);
//        Node h = new Node(4);
//        Node j = new Node(6);
//        Node k = new Node(7);
//        g.next = h;
//        h.next = j;
//        j.next = k;
//        MergeLinkedList(a,g);
//    }
//}


//public class mergeLinkedList {
//    public static void MergeLinkedList(Node head){
//        Node h1 = new Node(100);
//        Node temp = head;
//        while(temp!=null){
//            if(temp.data%2!=0){
//                h1 = temp;
//                System.out.print(h1.data+" ");
//            }
//            temp=temp.next;
//        }
//        temp=head;
//        while(temp!=null){
//            if(temp.data%2==0){
//                h1=temp;
//                System.out.print(h1.data+" ");
//            }
//            temp=temp.next;
//        }
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
//        Node a = new Node(1);
//        Node b = new Node(4);
//        Node c = new Node(5);
//        Node d = new Node(8);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        MergeLinkedList(a);
//    }
//}





public class mergeLinkedList {
    public static void Display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static Node MergeLinkedList(Node head){
        Node odd = new Node(0);
        Node even = new Node(0);
        Node tempo = odd;
        Node tempe = even;
        Node temp = head;
        while(temp!=null){
            tempo.next = temp;
            temp = temp.next;
            tempo = tempo.next;

            tempe.next = temp;
            if(temp==null)  break;
            temp = temp.next;
            tempe=tempe.next;
        }
        odd = odd.next;
        even = even.next;
        tempo.next = even;
        return odd;
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
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        Node k = MergeLinkedList(a);
        Display(k);
    }
}
