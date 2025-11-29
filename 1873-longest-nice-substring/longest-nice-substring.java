class Solution {
    public String longestNiceSubstring(String s) {
        return solve(s);
    }
    public String solve(String s){
        String left ="";
        String right ="";
        HashSet<Character> set = new HashSet<>();
        if(s.length() <=1){
            return "";
        }
        for(char c : s.toCharArray()){
             set.add(c);
        }
        for(int i =0;i<s.length();i++){
            if(!set.contains(Character.toUpperCase(s.charAt(i))) || !set.contains(Character.toLowerCase(s.charAt(i)))){
                 left = solve(s.substring(0,i));
                 right = solve(s.substring(i+1));
             return (left.length() >= right.length()) ? left : right;

        }
       
    }
    return s;
}
}