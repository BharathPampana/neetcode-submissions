class Solution {
    public int characterReplacement(String s, int k) {

        int n = s.length();
        Set<Character> set = new HashSet<>();
        for(char x : s.toCharArray()){
            set.add(x);
        }
        int ans = 0;
        for(char x : set)
        {
            int count = 0, l =0;
            for(int r = 0; r<n;r++)
            {
                if(s.charAt(r) == x){
                    count++;
                }
                while((r-l+1)-count > k){
                    if(s.charAt(l) == x){
                        count--;
                    }
                    l++;
                }
                ans = Math.max(ans, (r-l+1));
            }
        }
        return ans;
    }
}
