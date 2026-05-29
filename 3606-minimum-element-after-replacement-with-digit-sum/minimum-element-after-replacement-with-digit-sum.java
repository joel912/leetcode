class Solution {
    public int minElement(int[] nums) {
        int[] arr = new int[nums.length];
        int j =0;
        for(int i:nums){
            int ans = sum(i);
            arr[j] = ans;
            j++;
        }
        Arrays.sort(arr);
        return arr[0];
    }
    private int sum(int val){
        int sum =0;
        while(val!=0){
            int res = val%10;
            sum=sum+res;
            val=val/10;

        }
        return sum;
    }
}