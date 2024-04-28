public class stock {
  public static int profit(int prices[]) { // time complexity : O(n)

    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      if (buyPrice < prices[i]) {
        int profit = prices[i] - buyPrice;
        maxProfit = Math.max(maxProfit, profit);
      } else {
        buyPrice = prices[i];
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int prices[] = { 7, 6, 4, 3, 1 };
    System.out.println(profit(prices));
  }
}
