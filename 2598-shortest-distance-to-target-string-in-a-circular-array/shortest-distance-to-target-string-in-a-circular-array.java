class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int count =-1;
        int n = words.length;
        int count2 =-1;
        
        for(int i = 0; i< n ;i++){
         int current = (startIndex - i + n) % n;
         if(words[current].equals(target)){
            count =i;
            break;
         }
    }
     for(int i =0;i<n;i++){
        int curr = (startIndex +i)%n;
        if(words[curr].equals(target)){
            count2 = i;
            break;
        }
     }
     if(count == -1 && count2 == -1){
        return -1;
     }
     int d = Math.min(count,count2);
     return d;
           
    }
}