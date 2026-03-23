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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ajoin = list1;
        int count =0;
        while(count<a-1){
            ajoin = ajoin.next;
            count++;
        }
        ListNode bjoin = list1;
        int count2 =0;
        while(count2<=b){
            bjoin = bjoin.next;
            count2++;
        }
        ajoin.next = list2;
        ListNode endpoint = list2;
        while(endpoint.next!=null){
            endpoint= endpoint.next;
        }
        endpoint.next = bjoin;
        return list1;
    }
}