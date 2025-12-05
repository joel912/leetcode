class Solution {
    public List<Integer> grayCode(int n) {
        int num = 1 << n;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0;i<num;i++){
            int ans = i^(i>>1);
            res.add(ans);
        }
        return res;
    }
}