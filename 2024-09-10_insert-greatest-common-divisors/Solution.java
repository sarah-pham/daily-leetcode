/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr;
        ListNode next;

        curr = head;
        next = curr.next;

        while (next != null) {
            ListNode newNode = new ListNode(findGCD(curr.val, next.val));
            curr.next = newNode;
            newNode.next = next;

            curr = next;
            next = next.next;
        }

        return head;
    }

    private int findGCD(int a, int b) {
        return gcdHelper(Math.min(a, b), Math.max(a, b));
    }

    private int gcdHelper(int a, int b) {
        if (a == 0) {
            return b;
        }

        return gcdHelper(b % a, a);
    }

}