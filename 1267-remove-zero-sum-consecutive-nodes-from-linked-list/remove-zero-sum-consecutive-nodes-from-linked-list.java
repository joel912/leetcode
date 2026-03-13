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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int prefix = 0;
        ListNode temp = dummy;
        HashMap<Integer,ListNode> map = new HashMap<>();

        while(temp!=null){
            prefix += temp.val;
            map.put(prefix, temp);
            temp=temp.next;
        }
        prefix = 0;
        temp = dummy;
        while(temp!=null){
            prefix+=temp.val;
            temp.next = map.get(prefix).next;
            temp = temp.next;
        }
        return dummy.next;
    }
}