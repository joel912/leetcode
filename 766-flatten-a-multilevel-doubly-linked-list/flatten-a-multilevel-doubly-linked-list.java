/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr = head;
        Deque<Node> stack = new ArrayDeque<>();

        while(curr !=null){
            if(curr.child != null){
              if(curr.next!=null){
                stack.push(curr.next);

              }
              curr.child.prev = curr;
              curr.next = curr.child;
              curr.child = null;
            }
            if(curr.next==null && !stack.isEmpty()){
                 Node num = stack.pop();
                  curr.next = num;
                  num.prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}