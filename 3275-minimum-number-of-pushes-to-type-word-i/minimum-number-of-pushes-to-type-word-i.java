class Solution {
    public int minimumPushes(String word) {
        int c=0;
        int n=0;
        for(int i=0;i<word.length();i++){
            if(n<8){
                c++;
                n++;
            }
            else if(n<16){
                c+=2;
                n++;
            }
            else if(n<24){
                c+=3;
                n++;
            }
            else{
                c+=4;
            }

        }
        return c;
        
    }
}