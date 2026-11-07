class Solution {
    
    public int[] dailyTemperatures(int[] temperatures) {
         Stack<Integer> st = new Stack<>();
         int[] ans = new int[temperatures.length];
         for(int i = temperatures.length-1; i >= 0; i--){
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i] ){
                st.pop();
            }
            if(!st.isEmpty()){

                ans[i] =  st.peek() - i;
           
            }else{
      
                ans[i] = 0;
            }
                      st.push(i);
           
         }
         return ans;
    }
    
    /*
     public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            int count = 0;
            boolean status = false;
            for(int j = i+1; j < temperatures.length; j++){
                count++;
                if(temperatures[j] > temperatures[i]){
                  status = true;
                  break;
                }
                
                
            }
            if(status){
                ans[i] = count;
            }else{
                ans[i] = 0;
            }
        }
        return ans;
     }
     */

}
