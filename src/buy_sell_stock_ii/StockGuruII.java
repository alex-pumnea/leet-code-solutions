package buy_sell_stock_ii;

/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the
 * stock at any time. However, you can buy it then immediately sell it on the same day.
 *
 * Find and return the maximum profit you can achieve.
 * @author Alex Pumnea
 */
public class StockGuruII {
    public int maxProfit(int[] prices) {
        if (!isValid(prices)) return 0;

        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    private boolean isValid(int[] prices) {
        return prices != null && prices.length > 1;
    }
}
