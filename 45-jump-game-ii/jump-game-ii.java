class Solution {
    public int jump(int[] nums) {
        int a=0,b=0;
        int c=0;
        for(int i=0;i<nums.length-1 ;i++ ){
            a=Math.max(a,i+nums[i]);
            
            if(b==i){
                c++;
                b=a;
            }
            if(b>=nums.length-1){
                break;
            }
        }
        return c;
        
    }
}