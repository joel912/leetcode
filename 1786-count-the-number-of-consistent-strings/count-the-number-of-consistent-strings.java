class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count =0;
        for( String word : words){
          char n []= word.toCharArray();  
          for(int i=0; i<n.length;i++){
             if(!allowed.contains(String.valueOf(n[i]))){
                break;
             }
             else if (i == n.length-1 ){
                if(allowed.contains(String.valueOf(n[i]))){
                count++;
                }
             }
             else{
                continue;
             }
              }
          
        }
        return count;
    }
}