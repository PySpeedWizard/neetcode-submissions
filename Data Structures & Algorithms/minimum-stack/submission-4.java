class MinStack {
    /*
   Stack<Integer> main = new Stack<>();
   Stack<Integer> min = new Stack<>();
    public MinStack() {
    
    }
    
    public void push(int val) {
       
             main.push(val);
        if(min.isEmpty()){
             min.push(val);
        }else{
             min.push(Math.min(val,min.peek()));
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
    */
// inilization of object

   Stack<Integer> st = new Stack<Integer>();
  Stack<Integer> st2 = new Stack<Integer>();
   MinStack(){

   }


   public void push(int val){
    st.push(val);
    if(st2.isEmpty()){
        st2.push(val);
    }else{
        st2.push(Math.min(st2.peek(),val));
      
    }
   
   }
    public void pop(){
     st.pop();
     st2.pop();
   }
   public int top(){

    return st.peek();
   }
   public int getMin(){
    if(st.isEmpty() || st2.isEmpty()) return -1;
     return st2.peek();
   }




































}
