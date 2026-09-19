class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int  i :  nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->hm.get(a)-hm.get(b));
        for(int i : hm.keySet()){
            pq.offer(i);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] an = new int[k];
        for(int i = 0; i < k; i++){
            an[i] = pq.poll();
        }
        return an;
    }
}
