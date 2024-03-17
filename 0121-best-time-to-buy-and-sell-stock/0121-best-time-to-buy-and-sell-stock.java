import java.util.Arrays;

public class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] maxPrices = new int[n];
        maxPrices[n - 1] = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrices[i] = Math.max(maxPrices[i + 1], prices[i]);
        }
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, maxPrices[i] - prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(solution.maxProfit(prices1)); // Output: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(solution.maxProfit(prices2)); // Output: 0
    }
}