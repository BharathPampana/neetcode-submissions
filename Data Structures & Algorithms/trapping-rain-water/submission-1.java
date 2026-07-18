public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int l = 0, r = height.length - 1;
        int leftMax = height[l], rightMax = height[r];
        int res = 0;
        while (l < r) {
            if (leftMax < rightMax) {
                l++;
                if(Math.min(leftMax,rightMax) > height[l]){
                    res += (Math.min(leftMax,rightMax)-height[l]);
                }
                leftMax = Math.max(leftMax, height[l]);
            } else {
                r--;
                if(Math.min(leftMax,rightMax) > height[r]){
                    res += (Math.min(leftMax,rightMax) - height[r]);
                }
                rightMax = Math.max(rightMax, height[r]);
            }
        }
        return res;
    }
}