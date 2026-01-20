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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode val1 = head;
        for(int i =1;i < k;i++){
           val1= val1.next;
        }
       ListNode fast=val1.next;
        while(fast!=null){
            slow = slow.next;
            fast=fast.next;
        }
        int temp = val1.val;
        val1.val = slow.val;
        slow.val = temp;
        return head;
        
    }
}