public class Best_Time_to_sell {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(s.maxProfit(prices));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int buy_price = prices[0];
        for(int i=1;i<n;i++){
        int curr_prof = prices[i] - buy_price;
        if(curr_prof > maxProfit){
            maxProfit = curr_prof;
        }
        if(prices[i]<buy_price){
            buy_price = prices[i];
        }
        }
        return maxProfit;
    }
}



