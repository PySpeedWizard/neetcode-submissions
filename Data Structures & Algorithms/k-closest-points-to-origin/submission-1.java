class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int m = points[0].length;

        // HashMap<Integer,Double> hm = new HashMap<>();

        // for(int i =0;i < n; i++){
        //    double val = points[i][0] * points[i][0]
        //    + points[i][1] * points[i][1];
        //    hm.put(i,val);

        // }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1]));

        for (int[] point : points) {
            pq.offer(point);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[][] ans = new int[k][2];
        int i = 0;
        while (!pq.isEmpty()) {
            ans[i] = pq.poll();
            i++;
        }

        return ans;
    }
}
