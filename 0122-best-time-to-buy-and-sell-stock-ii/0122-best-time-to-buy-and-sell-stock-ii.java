class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int buy=0;
        int sell=buy+1;
        while(sell<prices.length){
            if(prices[buy]<prices[sell]){
                maxProfit+=prices[sell]-prices[buy];
                buy=sell;
                
            }else{
                buy=sell;
            }
            sell++;
            //System.out.println(r);


        }
        return maxProfit;
        
        
    }
}