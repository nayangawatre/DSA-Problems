class Solution {
    public int gcdOfOddEvenSums(int n) {
        int es=0;
        int os=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                es+=i;
            }
            else{
                os+=i;
            }

        }
        int r=0;

        while(os!=0){
            r=es%os;
            es=os;
            os=r;

        }

        return es;

        
    }
}