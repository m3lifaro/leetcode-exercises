package com.melifaro;

public class Exercise206_Java {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            ListNode accum = null;
            ListNode current = head;
            while (current.next != null) {
                accum = new ListNode(current.val, accum);
                current = current.next;
            }
            return new ListNode(current.val, accum);
        }
    }

    public static ListNode reverseNode(ListNode current, ListNode reversed) {
        if (current.next == null) {
            return new ListNode(current.val, reversed);
        } else {
            return reverseNode(current.next, new ListNode(current.val, reversed));
        }
    }
    public static ListNode reverseListRecursive(ListNode head) {
        if (head == null) {
            return null;
        } else {
            return reverseNode(head, null);
        }
    }

    public static void main(String[] args) {
        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode result = reverseList(input);
        System.out.println(result.val);
    }
}
