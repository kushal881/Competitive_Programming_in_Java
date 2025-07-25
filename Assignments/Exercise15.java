package Assignments;

import java.util.*;


public class Exercise15 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode segregate(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode zeroDummy = new ListNode(0);
        ListNode oneDummy = new ListNode(0);
        ListNode twoDummy = new ListNode(0);

        ListNode zero = zeroDummy, one = oneDummy, two = twoDummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == 0) {
                zero.next = curr;
                zero = zero.next;
            } else if (curr.val == 1) {
                one.next = curr;
                one = one.next;
            } else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }

        zero.next = oneDummy.next != null ? oneDummy.next : twoDummy.next;
        one.next = twoDummy.next;
        two.next = null;

        return zeroDummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(0);

        head = segregate(head);
        printList(head);
    }
}
