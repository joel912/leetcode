class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res =  new ArrayList<>();
        int k =10;
        for(int i =0;i<=s.length()-k;i++){
            String ans = s.substring(i,i+k);
            res.add(ans);
        }
        Map<String,Integer> num = new HashMap<>();
        for(int i =0;i<res.size();i++){
            String m = res.get(i);
            num.put(m,num.getOrDefault(m,0)+1);
        }
        
       
        List<String> ans1 = new ArrayList<>();
        for(String i: num.keySet()){
            if(num.get(i)>1){
                ans1.add(i);
            }
        }
        return ans1;
    }
}