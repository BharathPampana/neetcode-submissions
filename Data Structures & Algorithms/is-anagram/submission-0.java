class Solution {
    public boolean isAnagram(String s, String t) {

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String a = new String(s1);
        String b = new String(s2);
        if(a.equals(b))return true;
        return false;

    }
}
