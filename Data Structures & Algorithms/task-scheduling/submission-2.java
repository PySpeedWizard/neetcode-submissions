class Solution {
    /*
    public int leastInterval(char[] tasks, int n) {
        int[] fre = new int[26];
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : tasks){
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        Queue<Character> q = new LinkedList();
       for(char ch : hm.keySet()){
          q.offer(ch);
       }
       int count  = 0;
       int j = 0;
       char chPrevious = ' ';
       while(!q.isEmpty()){
        char chQueue = q.poll();
        hm.put(chQueue,hm.get(chQueue)-1);
        if(j == n ){
          count++;
          j=0;
        }
        if(chQueue == chPrevious){
            count = count + n;
        }

        if(hm.get(chQueue) >= 1){
            q.offer(chQueue);
        }
       chPrevious = chQueue;
       count++;
        j++;

       }
       return count ;
    }
    */
     public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : tasks){
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<int[]> q = new LinkedList();
       for(char ch : hm.keySet()){
          pq.offer(hm.get(ch));
       }
       int time = 0;
       while(!pq.isEmpty() || !q.isEmpty()){
          time++;
          if(pq.isEmpty()){
            time = q.peek()[1];
          }else{
              int cnt = pq.poll()-1;
              if(cnt > 0){
                q.add(new int[]{cnt , time + n});
              }
          }

          if(!q.isEmpty() && q.peek()[1] == time){
            pq.add(q.poll()[0]);
          }
          
       }
       return time;

     
























}
}
