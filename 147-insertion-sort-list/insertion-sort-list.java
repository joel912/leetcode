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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while(head!=null){
           res.add(head.val);
           head = head.next;
        }
        Collections.sort(res);
        ListNode val = dummy;
        
        for(int i =0;i<res.size(); i++){
            int value = res.get(i);
            ListNode val1 = new ListNode(value);
            val.next = val1;
            val= val.next;
        }
        return dummy.next;
    }
}