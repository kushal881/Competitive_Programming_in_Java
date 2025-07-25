package LinkedList;

public class PallindromeLinkedList {
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


    public static boolean Palindrome(Node head){
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
        while(p2!=null){
            if(p1.data!=p2.data){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return true;
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
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(Palindrome(a));
    }
}
