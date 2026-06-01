class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        for(String x : strs)
        {
            char[] charArray = x.toCharArray();
            Arrays.sort(charArray);
            String k = new String(charArray);
            m.putIfAbsent(k,new ArrayList<>());
            m.get(k).add(x);
        }
        return new ArrayList<>(m.values());
        
    }
}
