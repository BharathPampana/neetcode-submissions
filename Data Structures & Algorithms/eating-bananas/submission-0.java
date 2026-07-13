class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int r = 0;
        for(int x : piles){
            r = Math.max(r,x);
        }

        int l = 1;

        while(l<r)
        {
            int mid = l + (r-l)/2;
            int t = totalTime(piles, mid);

            if(t <= h)
            {
                r = mid;
            }
            else{
                l = mid+1;
            }
        }
        return r;
    }

    public int totalTime(int[] piles, int rate)
    {
        int ans = 0;

        for(int i=0;i<piles.length;i++)
        {
            Double x = (double)piles[i]/(double)rate;
            ans += (int) Math.ceil(x);
        }
        return ans;
    }
}
