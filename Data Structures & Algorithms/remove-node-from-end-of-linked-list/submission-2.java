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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        int length = 0;
        while (cur != null) {
            length++;
            cur = cur.next;
        }

        int i = 0;
        cur = dummy;
        while (i < length - n - 1) {
            cur = cur.next;
            i++;
        }

        cur.next = cur.next.next;

        return dummy.next;
    }
}
