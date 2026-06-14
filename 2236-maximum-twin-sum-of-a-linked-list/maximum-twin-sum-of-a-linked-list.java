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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;
        
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        
        ListNode p1 = head;
        ListNode p2 = prev;
        int maxTwinSum = 0;
        
     
        while (p2 != null) {
            int currentSum = p1.val + p2.val;
            maxTwinSum = Math.max(maxTwinSum, currentSum);
            
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return maxTwinSum;
    }
    }
