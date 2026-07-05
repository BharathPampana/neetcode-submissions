class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int ans = 0;
        int n = s.length();
        int l = 0, r = 0;
        while(r<n)
        {
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            ans = Math.max(ans, set.size());
            r++;
        }
        return ans;
    }
}
