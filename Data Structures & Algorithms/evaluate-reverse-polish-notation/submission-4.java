class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        int ans = 0;
        for(int i = 0; i  < tokens.length ; i++){
           // char ch = tokens[i];
            int a = 0;
            int b = 0;
            if(tokens[i].equals("+")){
                a = st.pop();
                b = st.pop();
                st.push(a+b);
            }
            else if(tokens[i].equals("-")){
                a = st.pop();
                b = st.pop();
                st.push(b - a);
            }
            else if( tokens[i].equals("*")){
                a = st.pop();
                b = st.pop();
                st.push(a*b);
            }else if(tokens[i].equals("/")){
                a = st.pop();
                b = st.pop();
                st.push(b /a);
            }
            else{
                 int num = Integer.parseInt(tokens[i]);
                 st.push(num);
            }
        }
        return st.pop();
    }
}
