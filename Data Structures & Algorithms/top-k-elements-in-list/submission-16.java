class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->hm.get(a)-hm.get(b));
        for(Integer i : hm.keySet()){
            pq.offer(i);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] ans = new int[k];
        int j = 0;
        while(!pq.isEmpty()){
            ans[j] = pq.poll();
            j++;
        }
        return ans;
    }
}
