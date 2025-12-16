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
    public boolean isPalindrome(ListNode head) {
        boolean res = false;
        ListNode temp = head;
        ArrayList<Integer> num = new ArrayList<>();
        int i=0;
        while(temp != null){
         num.add(temp.val);
          temp = temp.next;
        }
        ArrayList<Integer> num2 = new ArrayList<>(num);
        Collections.reverse(num2);
        if(num.equals(num2)){
            return true;
        }
       
        return res;
    
}
}