class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s=new HashSet<>();

        for(int i:nums){
            s.add(i);

        }
        int r=k;

        while(s.contains(r)){
            r+=k;
        }

        return r;
        
    }
}