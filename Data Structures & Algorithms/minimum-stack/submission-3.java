class MinStack {

    class Pair{
        int a;
        int b;
        public Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
    }

    Stack<Pair> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {

        if(st.isEmpty())
        {
            st.push(new Pair(val,val));
        }
        else{
            st.push(new Pair(val, Math.min(st.peek().b,val)));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().a;
    }
    
    public int getMin() {
        return st.peek().b;
        
    }
}
