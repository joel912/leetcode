class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long val = mass;
        for(int i : asteroids){
            if(val< i){
                return false;
            }
            val += i;
            
        }
        return true;
    }
}