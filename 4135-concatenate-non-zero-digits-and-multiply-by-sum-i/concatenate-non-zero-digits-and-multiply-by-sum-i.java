class Solution {
    public long sumAndMultiply(int n) {
        String res =  String.valueOf(n);
        long sum =0;
        StringBuilder val = new StringBuilder();
        for(char ch: res.toCharArray()){
            if(ch != '0'){
                val.append(ch);
                sum+=  ch - '0';
            }
        }
        if(val.length()== 0){
            return 0;
        }
        long result = Integer.parseInt(val.toString());
        return result * sum;
    }
}