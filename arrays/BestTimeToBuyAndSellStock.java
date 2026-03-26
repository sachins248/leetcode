class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        // Start buy at the first element in array as its currently the best buy.
        int buy = prices[0];
        // Loop through the prices array 
        for(int i = 1; i < prices.length; i++){
            // if the element is smaller/cheaper than what we bought buy that instead.
            if(prices[i] < buy){
                buy = prices[i];
            // otherwise calculate profit and use max function to return which is bigger.
            } else{
                int currentProfit = prices[i] - buy;
                profit = Math.max(currentProfit,profit);
            }
        }
        return profit;
    }
}
