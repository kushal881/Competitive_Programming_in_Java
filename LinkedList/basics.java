package LinkedList;
//
//public class basics {
//    public static int display(Node temp){
//        int count = 0;
//        while(temp!=null) {
////            System.out.print(temp.data + " ");
//            temp = temp.next;
//            count++;
//        }
//        return count;
//    }
//    public static void displayr(Node temp){
//        if(temp==null) return;
//        displayr(temp.next);
//        System.out.print(temp.data+" ");
//    }
//    public static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//        }
//    }
//    public static void main(String[] args) {
//        Node a  = new Node(5);
//        Node b = new Node(3);
//        Node c  = new Node(9);
//        Node d  = new Node(8);
//        Node e  = new Node(16);
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=e;
//        Node temp = a;
//        System.out.print("Length of the Node is: "+display(temp));
//        System.out.println();
//        displayr(temp);
//    }
//}

public class basics {
    public static void display(Node temp) {
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        }
        public static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }
        public static void main (String[]args){
            Node a = new Node(5);
            Node b = new Node(3);
            Node c = new Node(9);
            Node d = new Node(8);
            Node e = new Node(16);
            Node temp = a;
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            display(temp);
        }
    }