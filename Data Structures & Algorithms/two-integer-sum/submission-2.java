class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> m = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            m.put(nums[i],i);
        }
        int[] ans = new int[2];
        
        for(int i=0;i<n;i++){
           if(m.get(target-nums[i]) != null && i!=m.get(target-nums[i])){
            ans[0] = i;
            ans[1] = m.get(target-nums[i]);
            break;
           }
        }
        return ans;
    }
}
