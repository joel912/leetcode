class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));
        int ans =0;
        int presenergi = 0;

        for(int[] val : tasks){
            if(presenergi < val[1]){
                int extra = val[1] - presenergi;
                ans += extra;
                presenergi += extra;
            }
            presenergi -= val[0];

        }
        return ans;
    }
}