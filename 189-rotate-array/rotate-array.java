class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k %= n;
        ro(nums,0,n-1);
        ro(nums,0,k-1);
        ro(nums,k,n-1);
        
    }
    public void ro(int []nums,int l,int r){
        while(l<r){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
            l++;
            r--;
        }
    }

}