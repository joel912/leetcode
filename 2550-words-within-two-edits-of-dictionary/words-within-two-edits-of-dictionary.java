class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        ArrayList<String> res = new ArrayList<>();
        for(int i =0;i<queries.length;i++){
            int max =2;
            char[] word1 = queries[i].toCharArray();
            for(int j = 0;j<dictionary.length;j++){
               char[] word2 = dictionary[j].toCharArray();
                int count = 0;
                for(int k =0;k<word1.length;k++){
                    if(word1[k] == word2[k]){
                        count++;
                    }
                }
                if(word1.length- count<= max){
                    res.add(queries[i]);
                    break;
                }
                
            }
        }
        return res;
    }
}