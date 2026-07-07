class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
       Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        
        int max = 0;
        int val =0;
        for(int[] arr : intervals){
            if(arr[1]> max){
                val++;
                max = arr[1];
            }
            
        }
        return val;
    }
}
