class DLL{
        int key;
        int val;
        DLL next;
        DLL prev;

        public DLL(int key, int val){
            this.key = key;
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

class LRUCache {

    int capacity;
    Map<Integer, DLL> m;
    DLL head;
    DLL tail;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        DLL head = new DLL(-1,-1);
        DLL tail = new DLL(-1,-1);

        head.next = tail;
        tail.prev = head;

        this.head = head;
        this.tail = tail;

        this.m = new HashMap<>();
    }
    
    public int get(int key) {
        DLL x = m.get(key);
        if(x != null){

            DLL p = x.prev;
            DLL n = x.next;

            p.next = n;
            n.prev = p;

            DLL tp = tail.prev;
            tp.next  = x;
            x.prev = tp;
            x.next = tail;
            tail.prev = x;

            return x.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        DLL s = m.get(key);
        if(s != null){
            s.val = value;
            int p = get(key);
            return;
        }

        if(capacity == m.size() && m.size() != 0){
            DLL b = head.next;
            DLL c = b.next;
            head.next = c;
            c.prev = head;
            m.remove(b.key);
        }
        
        DLL x = new DLL(key, value);
        DLL p = tail.prev;
        p.next = x;
        x.prev = p;
        x.next = tail;
        tail.prev = x;
        m.put(key,x);

        
    }
}
