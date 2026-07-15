class TimeMap {

    public class Pair{
        int timeStamp;
        String value;

        public Pair(int timeStamp, String value){
            this.timeStamp = timeStamp;
            this.value = value;
        }
    }
    Map<String, ArrayList<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        ArrayList<Pair> x = map.getOrDefault(key,new ArrayList<>());
        x.add(new Pair(timestamp, value));
        map.put(key, x);
        // print(map);
        // System.out.println("done ");
    }
    
    public String get(String key, int timestamp) {

        ArrayList<Pair> arr = map.get(key);
        if(arr == null)return "";

        int l = 0, r = arr.size()-1;
        String result = "";
        while(l<=r)
        {
            int mid = l + (r-l)/2;

            if(arr.get(mid).timeStamp <= timestamp){
                result = arr.get(mid).value;
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return result;
    }

    public void print(Map<String, ArrayList<Pair>> map)
    {
        for(String x : map.keySet())
        {
            for(Pair y : map.get(x)){
                System.out.println("value - "+y.value+" , timestamp - "+y.timeStamp);
            }
        }
    }
}
