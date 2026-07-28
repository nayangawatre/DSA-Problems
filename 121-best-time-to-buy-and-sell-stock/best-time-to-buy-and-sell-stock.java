class Solution {
    public int maxProfit(int[] prices) {
        int a=0;
        int b=prices[prices.length-1];
        for(int i=prices.length-1;i>=0;i--){
            if(b>=prices[i]){
                int p=b-prices[i];
                a=Math.max(a,p);
            }
            else{
                b=prices[i];
            }

        }
        return a;
    }
}