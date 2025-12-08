class Solution {
    public int countTriples(int n) {
        
        int count =0;

        for(int c =n; c>=1;c--){
            for(int i = 1; i<=n ;i++){
                for(int j = c-1;j>=1;j--){
                    if(i*i + j*j == c*c){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}