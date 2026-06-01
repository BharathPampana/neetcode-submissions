class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> m = new HashMap<>();
        for(int i : nums)
            m.put(i,m.getOrDefault(i,0)+1);
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i<=n;i++)
        {
            arr.add(new ArrayList<>());
        }
        for(int i : m.keySet())
        {
            arr.get(m.get(i)).add(i);
        }
        int[] ans = new int[k];
        int j = 0;
        for(int i=n;i>=0;i--)
        {
            if(j==k) return ans;
            if(arr.get(i).size() != 0){
                for(int p : arr.get(i)){
                    ans[j] = p;
                    j++;
                    if(j == k)return ans;
                }
            }
        }
        return ans;
    }
}
