class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for(int i : arr){
           res.add(i);
        }
        Collections.sort(res,(a,b)->{
            int A = Integer.bitCount(a);
            int B = Integer.bitCount(b);
            if(A==B){
               return a-b;
            }
           return A-B;
        });
        int[] ans = new int[res.size()];
        for(int i =0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;

    }
}