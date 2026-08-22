class MinStack {
    Stack<Integer> main = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        main.push(val);
        if(min.isEmpty()){
            min.push(val);
        }
        else{
            min.push(Math.min(val,min.peek()));
        }
    }
    
    public void pop() {
    
        main.pop();
           min.pop();
        

        

    }
    
    public int top() {
       if(main.isEmpty())return -1;
       return main.peek(); 
    }
    
    public int getMin() {
  
        return min.peek();
    }
}
