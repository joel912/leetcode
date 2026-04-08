class Solution {
    public boolean check(int[] nums) {
        int[] arr = new int[nums.length];
        int n =0;
        for(int i : nums){
            arr[n] =i;
            n++;
        }
        int x =0;
        Arrays.sort(nums);
        for(int j =0;j<arr.length;j++){
            boolean t = true;
         for(int i =0 ;i <arr.length;i++){
             if(nums[i] != arr[(i+x)% arr.length]){
                 
                 t = false;
                 break;
            }
           
        }
        if(t){
            return true;
        }
        x++;
        }
        return false;
    }
}