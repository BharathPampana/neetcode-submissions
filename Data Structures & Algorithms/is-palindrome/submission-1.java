class Solution {
    public boolean isPalindrome(String s) {

        char[] arr = s.toCharArray();
        int n = s.length();
        int i = 0;
        int j = n-1;

        while(i<=j)
        {
            while(i<n && !Character.isLetterOrDigit(arr[i])){
                i++;
            }
            while(j>=0 && !Character.isLetterOrDigit(arr[j])){
                j--;
            }
            if(i>j)break;

            if(Character.toLowerCase(arr[i]) != Character.toLowerCase(arr[j])){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
