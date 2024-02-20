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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        ListNode head = null;
        ListNode curr = null;
        while(l1 != null || l2 != null || carry != 0){
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            sum = val1 + val2 + carry;
            int val = sum % 10;
            carry = sum / 10;
            ListNode node = new ListNode(val);
            if(head == null){
                head = node;
            } else {
                curr.next = node;
            }
            curr = node;
            l1 = l1 ==null? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return head;
        
    }
}