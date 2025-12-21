/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
     Map<ListNode,Integer> res = new HashMap<>();
     ListNode temp = head;
     while(temp!= null){
        res.put(temp,res.getOrDefault(temp,0)+1);
        if(res.get(temp) >1){
            return true;
        }
        temp = temp.next;
     }
     return false;
    }
}