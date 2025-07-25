package Assignments;

import java.util.*;


public class Exercise11 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }

    public static ListNode addTwoNumbers(ListNode num1, ListNode num2) {
        num1 = reverse(num1);
        num2 = reverse(num2);

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (num1 != null || num2 != null || carry != 0) {
            int sum = carry;
            if (num1 != null) {
                sum += num1.val;
                num1 = num1.next;
            }
            if (num2 != null) {
                sum += num2.val;
                num2 = num2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return reverse(dummy.next);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode num1 = new ListNode(7);
        num1.next = new ListNode(2);
        num1.next.next = new ListNode(4);
        num1.next.next.next = new ListNode(3);

        ListNode num2 = new ListNode(5);
        num2.next = new ListNode(6);
        num2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(num1, num2);
        printList(result);
    }
}
