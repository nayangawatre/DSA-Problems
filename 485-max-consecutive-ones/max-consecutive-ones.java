class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ans++;
                m=Math.max(m,ans);
            }else{
                ans=0;
            }

        }
        return m;
    }
}