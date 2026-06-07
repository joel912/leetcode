/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> res = new HashMap<>();
        Set<Integer> childset = new HashSet<>();
        for(int[] i : descriptions){
            int parent = i[0];
            int child = i[1];
             int val= i[2];

            if(!res.containsKey(parent)){
                res.put(parent, new TreeNode(parent));
            }
            if(!res.containsKey(child)){
                res.put(child, new TreeNode(child));
            }
            if(val == 1){
                res.get(parent).left = res.get(child);
            }
            else{
                res.get(parent).right = res.get(child);
            }
            childset.add(child);
        }
        for(int[] j : descriptions){
          int parentval = j[0];
          if (!childset.contains(parentval)) {
                return res.get(parentval);
            }
        }
       return null;
    }
}