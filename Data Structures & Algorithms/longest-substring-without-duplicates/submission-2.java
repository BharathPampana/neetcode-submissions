class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)return 0;
        Set<Character> uniqueChars = new HashSet<>();
        int l = 0;
        int r = 0;
        int n = s.length();
        int ans = 0;
        
        for(r = 0; r<n;r++)
        {
            while(uniqueChars.contains(s.charAt(r))){
                uniqueChars.remove(s.charAt(l));
                l++;
            }
            uniqueChars.add(s.charAt(r));
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}
