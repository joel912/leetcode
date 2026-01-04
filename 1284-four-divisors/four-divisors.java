class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans =0;
        for(int num: nums){
            ans += totalsum(num);
        }
        return ans;
    }
    public int totalsum(int num){
        int count =0;
        int sum =0;
        for(int i =1; i * i <= num;i++){
            if(num%i == 0){
                int div = num/i;
                if(div == i){
                    count++;
                    sum+= i;
                }
                else{
                    count= count+2;
                    sum+= (div + i);
                }
            }
            if(count > 4){
                return 0;
            }
        }
        if(count == 4){
            return sum;
        }
        return 0;
    }
}