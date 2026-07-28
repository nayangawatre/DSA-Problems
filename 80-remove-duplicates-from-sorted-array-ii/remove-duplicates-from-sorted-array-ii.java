class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0,k=1;
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                if(j!=2){
                    nums[k]=nums[i];
                    k++;

                    j++;

                }
               
            }else{
                j=1;
                nums[k]=nums[i];
                k++;
            }


        }
        return k;
    }
}