class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        int p = prices.length - 1;
        int d = discounts.length - 1;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double total_sum = 0;
        while(p>= 0 && d>=0){
            total_sum += (double) prices[p] * (100 - discounts[d]) / 100.0;
            p--;
            d--;
        }
        while(p>=0){
            total_sum += prices[p];
            p--;
        }
        return total_sum;
    }
}