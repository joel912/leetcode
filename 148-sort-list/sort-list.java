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
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        List<Integer> res = new ArrayList<>();
        while(temp!=null){
           res.add(temp.val);
           temp = temp.next;
        }
        Collections.sort(res);
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        for(int num : res){
            ListNode rum = new ListNode(num);
            curr.next = rum;
            curr= curr.next;
        }
        return ans.next;
    }
}