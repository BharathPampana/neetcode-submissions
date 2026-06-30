class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length())return false;

        Map<Character, Integer> originalMap = new HashMap<>();
        Map<Character, Integer> dynamicMap = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            originalMap.put(s1.charAt(i), originalMap.getOrDefault(s1.charAt(i),0)+1);
        }

        int l = 0;
        int r = s1.length()-1;
        

        for(int j=l;j<=r;j++)
        {
            dynamicMap.put(s2.charAt(j), dynamicMap.getOrDefault(s2.charAt(j),0)+1);
        }

        while(r < s2.length()){
            // System.out.println("dynamic Map");
            // printMap(dynamicMap);

            if(checkMapsEqual(originalMap, dynamicMap))return true;

            r++;
            if(r == s2.length())break;
            addToMap(dynamicMap,s2.charAt(r));
            removeFromMap(dynamicMap, s2.charAt(l));
            l++;
        }
        return false;
    }

    public void addToMap(Map<Character, Integer> m, Character x)
    {
        m.put(x, m.getOrDefault(x,0)+1);
    }

    public void removeFromMap(Map<Character, Integer> m, Character x)
    {
        if(m.get(x) != null && m.get(x) >1){
            m.put(x, m.get(x)-1);
        }
        else{
            m.remove(x);
        }
    }

    public boolean checkMapsEqual(Map<Character, Integer> m1, Map<Character, Integer> m2)
    {
        if(m1.size() != m2.size())return false;

        for(char x : m1.keySet()){
            if(m2.get(x) == null || m1.get(x) != m2.get(x))return false;
        }
        return true;
    }

    public void printMap(Map<Character, Integer> m)
    {
        for(char x : m.keySet())
        {
            System.out.println(x +" -> "+m.get(x));
        }
        System.out.println("");
    }
}
