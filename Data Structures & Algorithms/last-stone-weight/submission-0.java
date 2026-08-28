class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i: stones){
            pq.offer(i);
        }
  
        while(!pq.isEmpty() && pq.size() > 1){
            int y = pq.poll();
            int x = pq.poll();
            if(x == y)continue;
            if(x < y) pq.offer(y-x);
        
   
        }
        if(!pq.isEmpty())return pq.poll();
        return 0;

    }
}
