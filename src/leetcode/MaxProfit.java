package leetcode;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int minimunPrice = prices[0];
        int result = 0;

        for (int i = 0; i < prices.length; i++) {

            minimunPrice = Math.min(minimunPrice, prices[i]);

            result = Math.max(result, prices[i] - minimunPrice);

        }

        return result;
    }
}
