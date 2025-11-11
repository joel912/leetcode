class Solution {
    public int binaryGap(int n) {
         int last = -1;
         String res = Integer.toBinaryString(n);
         int max =0;
         for(int i=0;i<res.length();i++){
            if(res.charAt(i) == '1'){
               int firstpos = i;
                for(int j = i+1;j<res.length();j++){
                    if(res.charAt(j) == '1'){
                        max = Math.max(max,j-firstpos);
                        break;
                    }
                }
            }
         }
         return max;
    }
}