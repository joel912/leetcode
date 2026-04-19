class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0;
        int j =0;
        int maxx = 0;
        while(i<=nums1.length -1 && j<= nums2.length-1){
            if(i<=j && nums1[i]<=nums2[j]){
              maxx = Math.max(maxx, j-i);
             
            }
            else{
                i++;
            
            }
            j++;
        }
        return maxx;
    }
}