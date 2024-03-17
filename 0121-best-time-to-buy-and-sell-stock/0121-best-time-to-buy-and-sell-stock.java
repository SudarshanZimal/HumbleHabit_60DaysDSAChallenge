public class Solution {
    public void solve(int[] prices, int i, int[] min, int[] maxProfit) {
        if (i >= prices.length) {
            return;
        }
        if (prices[i] < min[0]) {
            min[0] = prices[i];
        }
        int profit = prices[i] - min[0];
        if (profit > maxProfit[0]) {
            maxProfit[0] = profit;
        }
        solve(prices, i + 1, min, maxProfit);
    }
    
    public int maxProfit(int[] prices) {
        int[] min = {Integer.MAX_VALUE};
        int[] maxProfit = {Integer.MIN_VALUE};
        int i = 0;
        solve(prices, i, min, maxProfit);
        return maxProfit[0];
    }
}