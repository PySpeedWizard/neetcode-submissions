class Solution {
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

    //    Set<Integer> set = new HashSet<>();
    //    for(int num: nums){
    //     if(map.containsKey(num)){
    //         if(map.get(num) >= k)
    //         set.add(num);
    //     }
    //    }
    //   int[] n = new int[set.size()];
    //   int i =0;
    //   for(int num : set){
    //     n[i] = num;
    //     i++;
    //   }
       return ans;
    }
}
