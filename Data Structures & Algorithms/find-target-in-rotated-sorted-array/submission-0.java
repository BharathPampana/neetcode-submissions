class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n-1;

        while(l<r)
        {
            int mid = (l+r)/2;

            if(nums[mid] < nums[r]){
                r = mid;
            }
            else{
                l = mid+1;
            }
        }
        
        int pivot = l;

        if(nums[pivot] <= target && target <= nums[n-1]){
            // do binary search on pivot & n-1;
            return binarySearch(nums,target,pivot, n-1);
        }
        return binarySearch(nums,target,0, pivot-1);
    }

    public int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
