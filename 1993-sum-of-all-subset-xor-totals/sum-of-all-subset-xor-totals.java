class Solution {
    public int subsetXORSum(int[] nums) {
       return recur(0,nums,0);
    }
    public int recur(int i,int[]nums,int xor){
        if(i==nums.length){
            return xor;
        }
       return recur(i+1,nums,xor^nums[i]) + recur(i+1,nums,xor);
    }
}