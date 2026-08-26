class Solution {
    public int numHours(int[] piles, int speed){
      int numHour = 0;
      for(int pile : piles){
         numHour += (pile + (speed-1)) /speed;
      }
      return numHour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        int ans =Integer.MAX_VALUE;
        for(int i  : piles){
         right = Math.max(i,right);
        }

        while( left <= right){
         int speed = (left + right)/2;
         int hours = numHours(piles,speed);
         if(hours <= h){
            ans = Math.min(speed,ans);
            right = speed-1;
         }else{
             left = speed+1;
         }
        }
        return ans;
    }
}
