class Solution {
    public int numberOfWays(String corridor) {
        int count =0;
        List<Integer> arr = new ArrayList<>();
        int mod = 1_000_000_007;
        int j=0;
        for(int i =0;i<corridor.length();i++){
            if(corridor.charAt(i) == 'S'){
                count++;
                arr.add(i);
                
            }
        }
        if(count%2 != 0){
            return 0;
        }
        if (arr.size() < 2) return 0;

       int prevind = arr.get(1);
       int res =1;
       for(int i =2; i< arr.size();i+=2){
        res = (int)((long)res * (arr.get(i)-prevind)%mod);
        prevind = arr.get(i+1);
       }
       return res;
    }
}