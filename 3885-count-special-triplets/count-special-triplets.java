class Solution {
    public int specialTriplets(int[] nums) {
     Map<Integer,Integer> right = new HashMap<>();
     for(int a: nums){
        right.put(a,right.getOrDefault(a,0)+1);
     }
    long total=0;
    long mod = 1_000_000_007;
    Map<Integer,Integer> left = new HashMap<>();
      for(int i=0;i<nums.length;i++){
      
       right.put(nums[i], right.get(nums[i]) - 1);
        
      int target= nums[i]*2;
        int leftCount = left.getOrDefault(target, 0);
       int rightCount = right.getOrDefault(target, 0);
        total = (total + (long)leftCount * rightCount) % mod;
         left.put(nums[i],left.getOrDefault(nums[i],0)+1);
      }
    return (int) total;
    }
}