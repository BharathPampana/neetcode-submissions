class Solution {
    public int maxArea(int[] heights) {

        int i = 0, j = heights.length-1;
        int maxi = Integer.MIN_VALUE;
        while(i<j)
        {
            maxi = Math.max(maxi, (j-i)*Math.min(heights[i],heights[j]));

            if(heights[i] < heights[j])
            {
               i++;
            }
            else{
                j--;
            }
        }
        return maxi;
    }
}
