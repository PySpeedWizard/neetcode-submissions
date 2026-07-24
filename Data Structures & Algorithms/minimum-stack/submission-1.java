class MinStack {
   Stack<Integer> main = new Stack<>();
   Stack<Integer> min = new Stack<>();
    public MinStack() {
    
    }
    
    public void push(int val) {
        if(main.isEmpty() && min.isEmpty()){
             main.push(val);
             min.push(val);
        }else{
        main.push(val);
        if(main.peek() > min.peek()){
            min.push(min.peek());
        }else{
           min.push(val);
        }
        }
    }
    
    public void pop() {
        main.pop();
        min.pop();
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        //st.getMin();
        if( main.isEmpty()|| min.isEmpty() ) return -1;
        return min.peek();
    }
}
