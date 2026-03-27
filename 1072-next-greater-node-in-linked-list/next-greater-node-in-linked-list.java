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
    public int[] nextLargerNodes(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        ArrayList<Integer> res = new ArrayList<>();
        
        while(first!= null){
            boolean found = false;
            int val1 = first.val;
            second = first.next;
            while(second != null){
                int val2 = second.val;
                if(val2>val1){
                    res.add(val2);
                    found = true;
                    break;
                    }
                
                second = second.next;
            }
            if(!found){
                res.add(0);
            }
            first= first.next; 
        }
int[] result = new int[res.size()];
for (int i = 0; i < res.size(); i++) {
    result[i] = res.get(i);
   }
return result;
    }
}