class Solution {
    public int maxProfit(int[] prices) 
    {
        int max=0;
        int minprice=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minprice)
            {
                minprice=prices[i];
            }
            profit=prices[i]-minprice;
            if(max<profit)
            {
                max=profit;
            }
        }
        
        return max;
    }
}
