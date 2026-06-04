class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i = num1; i<=num2;i++){
            ans += count(i);
        }
        return ans;
    }
    private int count(int num){
        int val =0;
        char[] charArray = String.valueOf(num).toCharArray();
        for(int i = 1;i <charArray.length-1;i++){
          if(charArray[i] > charArray[i-1] && charArray[i] > charArray[i+1]){
                val++;
            }
          if(charArray[i] < charArray[i-1] && charArray[i] < charArray[i+1]){
            val++;
          }
            
        }
        return val;
        
    }
}