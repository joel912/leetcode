class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        recur(nums,0,res,new ArrayList<>());
        return res;
    }
   public void recur(int nums[],int in, List<List<Integer>> res, List<Integer> ans ){
        if(in == nums.length){
            res.add(new ArrayList<>(ans));
            return;

        }
        
            ans.add(nums[in]);
            recur(nums,in+1,res,ans);
            ans.remove(ans.size()-1);
            recur(nums,in+1,res,ans);
        
       
    }
}