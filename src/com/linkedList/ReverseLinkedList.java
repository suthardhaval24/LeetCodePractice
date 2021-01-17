package com.linkedList;

import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head = reverse(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    private static ListNode reverse(ListNode head) {
        if (head == null ||  head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}
