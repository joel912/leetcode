class Solution {
    public int divide(int dividend, int divisor) {
         if (dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
         }
         boolean neg = (dividend<0) ^ (divisor<0);

        long a = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        int ans =0;
        while(a>=d){
             int count = 1;
             long temp = d;
             while(a>=(temp<<1)){
                  temp = temp<<1;
                  count = count<<1;
             }
           ans +=count;
           a -= temp;
        }
         return neg? -ans:ans;
    }
}