class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] res = new int[nums.length];
    
        for(int i =0;i<nums.length;i++){
        int sum =0;
        int sum1 = 0;
            for(int j = i+1;j<nums.length;j++){
                sum += nums[j];
            }
            if(i != 0){
            for(int f = i-1; f >= 0;f--){
                sum1 += nums[f];
            }
            }
            res[i] = Math.abs(sum1-sum);
        }
        return res;
    }
}