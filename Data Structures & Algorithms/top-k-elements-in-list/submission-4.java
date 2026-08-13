class Solution {
    /*
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
       for(int num : nums){
          map.put(num,map.getOrDefault(num,0)+1);
       } 
       PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
        for(int num : map.keySet()){
            pq.offer(num);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] ans = new int[k];
        int i =0;
        while(!pq.isEmpty()){
          ans[i++] = pq.poll();
        }

  
       return ans;
    }
    */

    //optimal
    /*

     public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        // define bucket
        ArrayList<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }

        int[] ans = new int[k];
        int index = 0;
        for(int i = bucket.length-1; i >= 0 && index < k;i-- ){
           
           if(bucket[i] != null){
            for(int num : bucket[i]){
                ans[index++] = num;
                
                if(index == k)
                  break;

            }
           }

        }
        return ans;


    }


    */

    //  public int[] topKFrequent(int[] nums, int k) {
    //     Set<Integer> set = new HashSet<>();
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for(int num : nums){
    //         map.put(num, map.getOrDefault(num,0)+1);
    //         int i = map.get(num);
    //         if(i >= k){
    //          set.add(num);
    //         }
        
    //     }
    //     int[] ans = new int[set.size()];
    //     int i =0;
    //     for(int t : set){
    //       ans[i++] =t;
    //     }
    //     return ans;
    //  }




    public int[] topKFrequent(int[] nums, int k) {
     
      Map<Integer, Integer> map = new HashMap<>();
       for(int num : nums){
          map.put(num,map.getOrDefault(num,0)+1);
       }
        PriorityQueue<Integer> pq = new PriorityQueue<> ((a,b)->map.get(a)-map.get(b));
         for(int num : map.keySet()){
           pq.offer(num);
           if(pq.size() > k){
            pq.poll();
           }
          
       }
       int[] ans = new int[k];
       int i =0;
        while(!pq.isEmpty())
        {
          ans[i++] = pq.poll();
        }
    
       return ans;
    }
}
