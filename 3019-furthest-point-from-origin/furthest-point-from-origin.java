class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int max1 = 0;
        char[] res = moves.toCharArray();
        for(int i =0;i<res.length;i++){
            if(res[i] == 'L'){
                max1--;
            }
            else if(res[i] == 'R'){
                max1++;
            }
            else{
                max1--;
            }
        }
        int val = Math.abs(max1);
        int max2 = 0;
        char[] res2 = moves.toCharArray();
        for(int i =0;i<res2.length;i++){
            if(res[i] == 'L'){
                max2--;
            }
            else if(res[i] == 'R'){
                max2++;
            }
            else{
                max2++;
            }
        }
        int val2 = Math.abs(max2);
        int ans = Math.max(val,val2);
        return ans;
    }
}