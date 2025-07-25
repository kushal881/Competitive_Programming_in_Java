package Assignments;

import java.util.*;


public class Exercise13 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return reverseK(head, k, count);
    }

    private static ListNode reverseK(ListNode head, int k, int remaining) {
        if (head == null) return null;

        int nodesToReverse = Math.min(k, remaining);
        ListNode prev = null, curr = head, next = null;
        int count = 0;

        while (curr != null && count < nodesToReverse) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if (next != null) {
            head.next = reverseK(next, k, remaining - nodesToReverse);
        }

        return prev;
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
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

        int k = 3;
        ListNode result = reverseKGroup(head, k);
        printList(result);
    }
}

