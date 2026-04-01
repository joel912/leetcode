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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        int firstpos = 0;
        int prevpos = 0;
        int mindist = Integer.MAX_VALUE;
        int i =1;
        while(curr != null && curr.next!=null){
            if((curr.val<prev.val && curr.val<curr.next.val) ||(curr.val > prev.val && curr.val > curr.next.val)){
                if(prevpos == 0){
                    firstpos =i;
                    prevpos = i;
                }
                else{
                  mindist = Math.min(mindist,i-prevpos);
                  prevpos = i;
                }
            }
            i++;
            prev = curr;
            curr= curr.next;
        }
        if(mindist == Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        return new int[]{mindist,prevpos- firstpos};
    }
}