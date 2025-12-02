class Solution {
    public int singleNumber(int[] nums) {
         HashMap<Integer, Integer> res = new HashMap<>();
         for(int a : nums){
            res.put(a,res.getOrDefault(a,0) + 1);
         }
         for(int a : nums){
            if(res.get(a) == 1){
                return a;
            }
            continue;
         }
         return 0;
    }
}