class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int s=nums[0];
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                s+=nums[i];
                //s+=c;
               // continue;
            }else {
                break;
            }
           
            }
            while(set.contains(s)){
                s++;
            }


        
        return s;

        
    }
}