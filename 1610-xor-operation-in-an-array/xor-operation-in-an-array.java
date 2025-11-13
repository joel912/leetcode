class Solution {
    public int xorOperation(int n, int start) {
        int arr[] = new int[n+1];
        
        for(int i = 0; i <= n-1;i++){
        
              int ans = start+2*i;
              arr[i]=ans;
               
        }
        int res =0;
        for(int i:arr){
            res^=i;
        }
        return res;
    }
}