class Solution {
    public int maxDistance(int[] colors) {
        int i =0;
        int n = colors.length;
        int j =n-1;
        int max = 0;
        while(i<j){
            if(colors[i] != colors[j]){
                max = Math.max(max,j-i);
            }
            j--;
        }
        i =0;
        j = n-1;
         while(i<j){
            if(colors[i] != colors[j]){
                max = Math.max(max,j-i);
            }
            i++;
        }
         i =0;
         j = n-1;
        while(i<j){
            if(colors[i] != colors[j]){
                max = Math.max(max,j-i);
            }
            i++;
            j--;
        }
        return max;
    }
}