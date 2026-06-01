class Solution {

    public String encode(List<String> strs) {
        String temp="";
        for(String x : strs)
            temp = temp + x.length()+'#'+x;

        // System.out.println(temp);
        return temp;
    }

    public List<String> decode(String str) {
        int i=0;
        int n = str.length();
        char[] arr = str.toCharArray();
        // System.out.println(arr);
        List<String> ans = new ArrayList<>();
        while(i<n)
        {
            // System.out.println(i);
            String num = "";
            while(i<n && arr[i] != '#'){
                num = num + arr[i];
                i++;
            }
            // System.out.println(num);
            int l = 0;
            if(num.length() != 0)
                l = Integer.parseInt(num);
            String temp="";
            int j = i+1;
            while(j<=i+l){
                temp = temp + arr[j];
                j++;
            }
            ans.add(temp);
            i = j;
        }
        return ans;
    }
}
