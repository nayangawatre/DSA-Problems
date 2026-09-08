class Solution {
    public int countCommas(int n) {
        int c=0;
        int a=1000;
        while(n>=a){
            c++;
            a++;
        }
        return c;
    }
}