class Solution {
    public int maxProfit(int[] prices) {

        int mini = prices[0];
        int n = prices.length;
        int ans = 0;
        for(int i=1;i<n;i++){

            ans = Math.max(ans, prices[i]-mini);
            mini = Math.min(mini, prices[i]);
        }
        return ans;
        
    }
}
