class Solution {
    public int maxProfit(int[] prices) {
        int lowest = Integer.MAX_VALUE;
        int highestRange = 0;
        
        for (int price : prices) {
            if (price < lowest) {
                lowest = price;
            }
            else if (price - lowest > highestRange) {
                highestRange = price - lowest;
            }
        }
        return highestRange;
    }
}