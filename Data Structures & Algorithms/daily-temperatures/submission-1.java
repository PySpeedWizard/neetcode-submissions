class Solution {
    /*
    public int[] dailyTemperatures(int[] temperatures) {

        int n =temperatures.length;
        int[] ans = new int[n];
        for(int i = 0; i< n; i++){
          
        
            for(int  j =i+1; j< n; j++){
               if(temperatures[j] > temperatures[i]){
                   ans[i] = j-i;
                   break;
                   
               }
              
            }
        

        }
        return ans;
    }
    */

/*
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n =temperatures.length;
        int[] ans = new int[n];
        for(int i = 0; i< n; i++){}

        return ans;
        }
}
*/


 public int[] dailyTemperatures(int[] temperatures) {
    int n = temperatures.length;

    int[] ans = new int[n];
    for(int i =0 ; i<n ;i++){
        int count=0;
        boolean flag = false;;
        for(int j = i+1; j< n; j++){
            count++;
             if(temperatures[j] > temperatures[i]){
                flag = true;
                break;
             }
            //  }else if(temperatures[j] > temperatures[])
        }
        if(flag){
        ans[i] =count;
        }else{
            ans[i] =0;
        }
    }
    return ans;
 }



















}


