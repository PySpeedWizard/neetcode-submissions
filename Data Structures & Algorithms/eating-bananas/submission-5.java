class Solution {
     public int numberOfHours(int[] piles, int speed) {
        int count = 0;
        for(int i =0 ;i<piles.length; i++){
        
          count += (piles[i]+speed-1) / speed;
        }
        return count;
     }

    public int minEatingSpeed(int[] piles, int h) {
     int left =1;
     int rigth =0;
    
     for(int  j : piles){
        rigth = Math.max(rigth, j);
     }
        int min = rigth;
     while(left <= rigth){
        int speed = (rigth+left)/2;
        int hours = numberOfHours(piles, speed);

        if(hours <= h){
            min = speed;
            rigth = speed-1;  
        }else{
            left = speed +1;
        }
     }
           
           
            
        return min; 
    }
}

