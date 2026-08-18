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
    public ListNode reverseList(ListNode head) {
        ListNode inter = null;
        while(head != null){
            if(inter == null){
                inter = new ListNode(head.val);
            } else {
                inter = new ListNode(head.val, inter);
            }
            head = head.next;
        }
        return inter;
    }
}
