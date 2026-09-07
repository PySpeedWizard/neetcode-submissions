class Solution {
     public int numberofHours(int[] piles, int speed) {
         int eatingRate = 0;
         for(int i : piles){
            int temp = (i + (speed-1))/speed;
            eatingRate += temp; 
         }
        return eatingRate;
     }
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        int ans   = -1;
        for(int pile : piles){
            end = Math.max(end,pile);
        }

        while(start <= end){
            int speed = (start + end)/2;
            int numberOfHours = numberofHours(piles,speed);

            if(numberOfHours <= h){
                ans = speed;
                end = speed -1;
            }else{
                start  = speed +1;
            }
        }
        return ans;
    }
}
