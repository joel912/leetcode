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
    public ListNode deleteMiddle(ListNode head) {
        int n =0;
        if (head == null || head.next == null) return null;
        
       ListNode num = head;
       
        ListNode res = head;
        while(num!= null){
            n++;
            num = num.next;
        }
        int count= n/2;
        int i =0;
        while(i<count-1){
            res = res.next;
            i++;
        }
        res.next = res.next.next;
        return head;
    }
    }
