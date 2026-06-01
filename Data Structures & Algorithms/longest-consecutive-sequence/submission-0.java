class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        if(n == 0)return 0;
        int m = nums[0];
        int mi = nums[0];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            m = Math.max(m,i);
            mi = Math.min(mi,i);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int ans = 0;
        int temp = 0;
        while(mi<=m){
            if(map.get(mi) != null){
                temp++;
            }
            else{
                ans = Math.max(ans,temp);
                temp = 0;
            }
            mi++;
        }
        ans = Math.max(ans,temp);
        return ans;
    }
}
