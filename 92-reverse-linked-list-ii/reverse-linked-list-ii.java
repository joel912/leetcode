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
    public ListNode reverseBetween(ListNode head, int left, int right) {
      ListNode dummy = new ListNode(0);
      dummy.next = head;
       ListNode beforeLeft = dummy;
       for(int i =1;i<left; i++){
        beforeLeft = beforeLeft.next;
       }
       ListNode prev = null;
       ListNode curr = beforeLeft.next;
         for(int i =0;i<=right-left;i++){
            ListNode res = curr.next;
            curr.next = prev;
            prev = curr;
            curr = res;
        }
        beforeLeft.next.next = curr;
        beforeLeft.next = prev;

   return dummy.next;
        }
        
        
     
    }
