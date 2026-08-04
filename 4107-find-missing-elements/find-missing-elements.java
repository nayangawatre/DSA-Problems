class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l=new ArrayList<Integer>();
        Arrays.sort(nums);
        int a=nums[0];
        int e=nums[nums.length-1];
        int i=0;
        while(a!=e){
            if(a==nums[i]){
                a++;
                i++;
            }else{
                l.add(a);
                a++;
            }

        }
        // for(int i=0;i<nums.length;i++){
        //     if(a==nums[i]){
        //         a++;
        //     }
        //     else{
        //         l.add(a);
        //         a+=2;
                
        //     }
        // }
        return l;

        
    }
}