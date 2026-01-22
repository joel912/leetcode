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
       
        ListNode res = new ListNode(0);
        ListNode curr = res;
        int carry =0;
        int s1 =0;
        int s2 =0;
       while(l1 !=null || l2 !=null || carry != 0){
        if(l1 !=null){ 
         s1 = l1.val;
        }
        if(l2 !=null){
        s2 = l2.val;
        }
        int sum = s1+s2+carry;
       curr.next = new ListNode(sum % 10);
       
        carry = sum/10;
        if(l1!=null){
        l1 = l1.next;
        s1 =0;
        }
        
        if(l2!=null){
        l2 = l2.next;
        s2 = 0;
        }
        
        curr = curr.next;
       }
       return res.next;

    }
}