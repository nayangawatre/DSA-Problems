class Solution {
    public int smallestIndex(int[] nums) {
        int a=-1;
        for(int i=0;i<nums.length;i++){
            int b=nums[i];
            int r=0;
            while(b!=0){
                r+=b%10;
                b=b/10;
            }
            if(r==i){
                if(a<0){
                    a=r;
                }
                else if(r<a){
                    a=r;
                }
            }

        }
        return a;
    }
}