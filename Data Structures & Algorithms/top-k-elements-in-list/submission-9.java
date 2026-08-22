class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
       

        for(int num : nums){
         hm.put(num,hm.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->hm.get(a) - hm.get(b));
        for(int i: hm.keySet()){
            queue.offer(i);

            if(queue.size() > k){
                queue.poll();
            }

        }
       int[] ans = new int[k];
       for(int i =0; i< k; i++){
        ans[i] = queue.poll();
       }
        
           return ans;    
            
           
        }
       
    
}
