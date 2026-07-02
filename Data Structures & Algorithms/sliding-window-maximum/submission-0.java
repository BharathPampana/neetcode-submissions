class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

         int l = 0;
         int r=0;
         while(r<k)
         {
            maxHeap.add(nums[r]);
            r++;
         }

         ArrayList<Integer> ans = new ArrayList<>();
         r--;
         while(r<nums.length-1)
         {
            ans.add(maxHeap.peek());
            if(r == nums.length)break;
            maxHeap.remove(nums[l]);
            l++;
            r++;
            maxHeap.add(nums[r]);
         }
        ans.add(maxHeap.peek());
        int[] res = new int[ans.size()];
        int i = 0;
        for(int x : ans){
            res[i] = x;
            i++;
        }
        return res;
    }
}
