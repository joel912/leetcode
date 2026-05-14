class Solution {
    public boolean isGood(int[] nums) {
        int max = 0;
        int n = nums.length;
        Arrays.sort(nums);
       max = nums[n-1];
       
        int count2 = 0;
        int count1 =0;
        for(int i =0;i<nums.length;i++){
           if(nums[i] == max){
            count2++;
           }
          if(nums[i] != i+1 && i!= nums.length-1){
            return false;
           }
           count1++;
        }
         if(count1!=max+1){
            return false;
        }
        if(count2!=2){
            return false;
        }

       return true; 
    }
}