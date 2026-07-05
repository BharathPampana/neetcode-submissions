class Solution {
    public int maxProfit(int[] prices) {

        int mini = prices[0];
        int r = 1;
        int n = prices.length;
        int ans = 0;
        while(r<n)
        {
            ans = Math.max(ans, prices[r]-mini);
            mini = Math.min(mini, prices[r]);
            r++;
        }
        return ans;
        
    }
}
