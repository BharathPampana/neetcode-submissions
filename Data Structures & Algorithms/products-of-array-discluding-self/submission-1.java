class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] prefix = new int[n];
        
        prefix[0] = nums[0];
        for(int i=1;i<n;i++){
            
            prefix[i] = prefix[i-1] * nums[i];
        }

        // for(int x : prefix)
        //     System.out.println(x + " ");

        int[] postfix = new int[n];
        int i=n-1;
        postfix[i] = nums[n-1];
        i--;
        while(i>=0){
            postfix[i] = nums[i] * postfix[i+1];
            i--;
        }

        // for(int x : postfix)
        //     System.out.println(x + " ");

        int[] ans = new int[n];
        for(int j=1;j<n-1;j++){
            ans[j] = postfix[j+1] * prefix[j-1];
        }
        ans[0] = postfix[1];
        ans[n-1] = prefix[n-2];
        return ans;
        
    }
}  
