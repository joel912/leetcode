class Solution {
    public int mirrorDistance(int n) {
        int val = n;
        int rev = 0;
        while(val>0){
            int num = val%10;
            rev = rev*10+num;
            val=val/10;
        }
       return Math.abs(n-rev);
    }
}