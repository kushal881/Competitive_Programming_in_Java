//package LinkedList;
//
//public class middleElement {
//    public static void middleelement(Node head){
//        Node t = head;
//        int count = 0;
//        int c = 0;
//        int c1 = 0;
//
//        while(t!=null){
//            count++;
//            t = t.next;
//        }
//        int num2 = (count+1)/2;
//        int num1 = count/2;
//        t=head;
//        if(count%2==0){
//            while(t!=null){
//                c++;
//                if(num1==c){
//                    System.out.print(t.data);
//                }
//                t=t.next;
//            }
//            }
//        else{
//            while(t!=null){
//                c1++;
//                if(num2==c1){
//                    System.out.print(t.data);
//                }
//                t=t.next;
//            }
//            }
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
//        middleelement(a);
//    }
//}



package LinkedList;

public class middleElement {
    public static void middleElement(Node head){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=2;i++){
            fast = fast.next;
        }
        while(fast.next.next!=null){
            System.out.print(slow.data+" ");
            fast = fast.next;
            slow = slow.next;
        }
        slow=slow.next;
        while(slow!=null){
            System.out.print(slow.data+" ");
            slow=slow.next;
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
        Node i = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = i;
        middleElement(a);
    }
}
