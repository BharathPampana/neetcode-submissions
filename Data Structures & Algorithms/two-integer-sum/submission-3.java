class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> m = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(m.get(nums[i]) == null){
                m.put(target-nums[i],i);
            }
            else{
                return new int[]{m.get(nums[i]),i};
            }
        }
        return null;
    }
}
