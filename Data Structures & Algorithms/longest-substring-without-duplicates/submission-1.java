class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)return 0;
        Map<Character, Integer> fre = new HashMap<>();
        int a = 0;
        int b = -1;
        int n = s.length();
        int ans = 1;
        while(b < n-1)
        {
            b++;
            Character i = s.charAt(b);
            fre.put(i,fre.getOrDefault(i,0)+1);

            if(fre.get(i) >= 2){
                while(true){
                    fre.put(s.charAt(a), fre.get(s.charAt(a))-1);
                    if(s.charAt(a) == i){
                        a++;
                        break;
                    }
                    a++;
                }
            }

            ans = Math.max(ans, b-a+1);
        }
        return ans;
    }
}
