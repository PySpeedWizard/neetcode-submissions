class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int m = points[0].length;
        int[][] ans = new int[k][2];
        HashMap<Integer,Double> hm = new HashMap<>();

        for(int i =0;i < n; i++){
           double val = points[i][0] * points[i][0]
           + points[i][1] * points[i][1];
           hm.put(i,val);
             
        }
PriorityQueue<Integer> pq =
    new PriorityQueue<>((a, b) ->
        Double.compare(hm.get(a), hm.get(b)));

        for(int  i :  hm.keySet()){
            pq.offer(i);
        }

        for(int i =0; i < k; i++){
            ans[i] = points[pq.poll()];
        }
        return ans;
   
    }
}
