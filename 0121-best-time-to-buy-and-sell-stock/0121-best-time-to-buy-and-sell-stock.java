class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int l=0;
        //int buyPrice=prices[l];
        int r=l+1;
        //int sellPrice=prices[r];

        while(r<prices.length){
            if(prices[l]<prices[r]){
                profit=Math.max(profit,prices[r]-prices[l]);
                
            }else{
                l=r;
            }
            r++;
            //System.out.println(r);


        }
        return profit;
    }
}
