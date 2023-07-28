package in.eatabyte.codechallenge.maxprofit;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int buyIndex = 0, sellIndex = 0, profit = 0;
        int buy = prices[0], sell = prices[0];
        for (int index = 0; index < prices.length; index++) {
            int priceToday = prices[index];
            int difference = priceToday - buy;
            if (profit < difference) {
                sell = priceToday;
                sellIndex = index;
            } else {
                if (priceToday < buy) {
                    buy = priceToday;
                    buyIndex = index;
                    if (index != prices.length - 1) {
                        sellIndex = index + 1;
                        sell = prices[sellIndex];
                    }
                }
            }
            if ((buyIndex < sellIndex) && ((sell - buy) > profit)) {
                profit = sell - buy;
            }
        }
        return profit;
    }

}
