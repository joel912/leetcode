class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> res = new HashMap<>();
        int min = Integer.MAX_VALUE;
        boolean num = false;
    for(int i =0; i<nums.length;i++){
        if(res.containsKey(nums[i])){
            num = true;
              int j = res.get(nums[i]);
             min = Math.min(min, i - j);
           
        }
        int rev = reverse(nums[i]);
            res.put(rev, i);

    }
    if(!num){
        return -1;
    }
    return min;
    }
    public int reverse(int n){
        int rev = 0;
        while(n>0){
        int val = n%10;
        rev = rev*10 +val;
        n = n/10;
        }
        return rev;
    }
}