import java.util.Arrays;

public class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyAtPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            buyAtPrice = Math.min(buyAtPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - buyAtPrice);
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