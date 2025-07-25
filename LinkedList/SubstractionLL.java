package LinkedList;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SubstractionLL {

    // Helper function to reverse a linked list
    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Helper function to remove leading zeros
    static Node removeLeadingZeros(Node head) {
        while (head != null && head.data == 0) {
            head = head.next;
        }
        return head == null ? new Node(0) : head;
    }

    // Subtract two reversed linked lists
    static Node subtractLists(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node curr = dummy;
        int borrow = 0;

        while (l1 != null) {
            int d1 = l1.data;
            int d2 = (l2 != null) ? l2.data : 0;

            int sub = d1 - d2 - borrow;

            if (sub < 0) {
                sub = sub + 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            curr.next = new Node(sub);
            curr = curr.next;

            l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return removeLeadingZeros(reverse(dummy.next));
    }

    // Main subtract function
    static Node subtract(Node l1, Node l2) {
        // Reverse both lists
        l1 = reverse(l1);
        l2 = reverse(l2);

        return subtractLists(l1, l2);
    }

    // Helper to print list
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Helper to create list from number
    static Node createList(int num) {
        String s = Integer.toString(num);
        Node dummy = new Node(0);
        Node curr = dummy;

        for (char c : s.toCharArray()) {
            curr.next = new Node(c - '0');
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node l1 = createList(786);
        Node l2 = createList(453);

        System.out.print("List 1: ");
        printList(l1);

        System.out.print("List 2: ");
        printList(l2);

        Node result = subtract(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }
}
