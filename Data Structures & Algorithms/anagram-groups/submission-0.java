class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<String> temp = new ArrayList<>();
        Map<String, List<String>> m = new HashMap<>();
        for(String x : strs)
        {
            char[] charArray = x.toCharArray();
            Arrays.sort(charArray);
            String k = new String(charArray);
            temp.add(k);
            if(m.get(k) != null){
                List<String> l = m.get(k);
                l.add(x);
                m.put(k,l);
            }
            else{
                List<String> p = new ArrayList<>();
                p.add(x);
                m.put(k,p);
            }
        }

        List<List<String>> ans = new ArrayList<>();
        for(String x : m.keySet())
        {
            ans.add(m.get(x));
        }
        return ans;
        
    }
}
