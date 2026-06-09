class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i: nums){
            if(i > max){
                max = i;
            }
            if(i< min){
                min = i;
            }
        }
         long ans = max - min;
        return ans *k;
    }
}