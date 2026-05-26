class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        Set<Character> res = new HashSet<>();
        Set<Character> res1 = new HashSet<>();
        for(char c : word.toCharArray()){
            if(Character.isLowerCase(c)){
                res.add(c);
            }
            else{
                res1.add(c);
            }
        }
        for(char c : res){
           char val = Character.toUpperCase(c);
            if(res1.contains(val)){
                count++;
            }
        }
        return count;
    }
}