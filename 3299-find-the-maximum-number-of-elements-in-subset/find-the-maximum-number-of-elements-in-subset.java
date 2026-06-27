class Solution {
    public int maximumLength(int[] nums) {
     HashMap<Long, Integer> res = new HashMap<>(); 
        
       
        for (int i = 0; i < nums.length; i++) {
            long val = (long)nums[i];
            res.put(val, res.getOrDefault(val, 0) + 1); 
        } 
        
        int ans = 1;
        
       
        if (res.containsKey(1L)) {
            int countOnes = res.get(1L); 
            if (countOnes % 2 == 0) {
                ans = Math.max(ans, countOnes - 1); 
            } else {
                ans = Math.max(ans, countOnes); 
            } 
        } 
        
   
        for (Long num : res.keySet()) {
            if (num == 1L) continue; 
            
            int count = 0; 
            Long curr = num; 
            
          
            while (res.containsKey(curr)) {
                if (res.get(curr) >= 2) {
                    count += 2; 
                    curr = curr * curr; 
                } else {
                    count++; 
                    break;
                }
            }
            
         
            if (!res.containsKey(curr) && count > 0) {
                count--;
            }
            
            ans = Math.max(ans, count);
        }
        
        return ans;
    }
}
