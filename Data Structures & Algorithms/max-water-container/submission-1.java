class Solution {
    /*
    public int maxArea(int[] heights) {
        int left = 0; 
        int right= heights.length-1;
        int maxArea = 0;

        while(left < right){
            int w = right - left;
            int h = Math.min(heights[left], heights[right]);
             maxArea = Math.max(maxArea, w*h);
             if(heights[left] < heights[right]){
                left++;
             }
             else{
                right--;
             }
        
        }
        return maxArea;
    }










*/














        public int maxArea(int[] heights) {
            int area = 0;
            int start =0;
            int end = heights.length-1;
            while(start < end){
                int height = Math.min(heights[start],heights[end]);
                int width = end -start ;
                area = Math.max(area, height*width);
                if(heights[start] < heights[end]){
                    start++;
                }else{
                    end--;
                }
            }
            return area;
        }
}
