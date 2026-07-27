class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []ans=new int[nums.length];
        int i=0;
        int s=0;
        while(s<nums.length){
            if(s%2==0){
                ans[s]=nums[i];
                s++;
                i++;
            }
            else{
                ans[s]=nums[n];
                s++;
                n++;
            }
        }
        return ans;
        
    }
}