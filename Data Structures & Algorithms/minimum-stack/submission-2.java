class MinStack {

    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void print(Stack<Integer> x)
    {
        System.out.println(x);
    }
    
    public void push(int val) {
        st.push(val);
        if(minSt.isEmpty()){
            minSt.push(val);
        }
        else{
            if(minSt.peek() >= val){
                minSt.push(val);
            }
        }
        // print(minSt);
    }
    
    public void pop() {
        if(st.peek().equals(minSt.peek())){
            minSt.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
