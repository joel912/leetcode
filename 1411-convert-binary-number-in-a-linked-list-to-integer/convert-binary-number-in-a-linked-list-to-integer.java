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
    public int getDecimalValue(ListNode head) {
        String num = "";
        ListNode temp = head;
        while(temp != null){
            int n = temp.val;
            String s = Integer.toString(n);
            num += s;
            temp = temp.next;
        }
        int ans = Integer.parseInt(num,2);
        return ans;
    }
}