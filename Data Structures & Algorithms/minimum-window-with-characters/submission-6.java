class Solution {
    public String minWindow(String s, String t) {

        if(t.length() == 0)return "";

        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for(char x : t.toCharArray()){
            countT.put(x , countT.getOrDefault(x,0)+1);
        }

        int l = 0;
        int have = 0, need = countT.size();
        int a = -1;
        int b = -1;
        int resLen = Integer.MAX_VALUE;
        for(int r = 0;r<s.length();r++)
        {   
            char x = s.charAt(r);
            window.put(x, window.getOrDefault(x,0)+1);

            if(countT.containsKey(x) && countT.get(x) == window.get(x)){
                have++;
            }

            while(have == need)
            {
                if((r-l+1) < resLen){
                    a = l;
                    b = r;
                    resLen = (r-l+1);
                }

                char leftChar = s.charAt(l);
                window.put(leftChar, window.getOrDefault(leftChar, 0)-1);
                if(countT.containsKey(leftChar) && window.get(leftChar)<countT.get(leftChar)){
                    have--;
                }
                l++;
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(a,b+1);
    }
}
