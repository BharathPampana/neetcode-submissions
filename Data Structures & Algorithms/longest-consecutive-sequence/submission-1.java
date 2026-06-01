class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        if(n == 0)return 0;
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
           set.add(i);
        }
        
        int ans = 0;
        for(int num : set)
        {
            if(!set.contains(num-1)){
                int currNum = num;
                int curr = 1;
                while(set.contains(currNum+1)){
                    curr++;
                    currNum++;
                }
                ans = Math.max(ans, curr);
            }
        }
        return ans;
    }
}
