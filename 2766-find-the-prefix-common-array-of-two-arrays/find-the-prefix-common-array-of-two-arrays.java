class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> res = new HashSet<>();
        int[] arr = new int[A.length];
        int count =0;
        for(int i =0;i<A.length;i++){
            if(A[i]!=B[i]){
                if(res.contains(A[i])){
                    count++;
                }
                if(res.contains(B[i])){
                    count++;
                }
                res.add(A[i]);
                res.add(B[i]);
            }
            if(A[i] == B[i]){
                count++;
                res.add(A[i]);
            }
            arr[i] = count;


        }
        return arr;
    }
}