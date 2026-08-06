class Solution {
    public int smallestNumber(int n, int t) {
       
        int a=n;
        while(true){
            int j=a;
             int p=1;
             while(j!=0){
                int c=j%10;
                p=p*c;
                j=j/10;

            }
            if(p%t==0){
               return a;
        }
        else {
            a++;
        }
        }
        
        
    }
}