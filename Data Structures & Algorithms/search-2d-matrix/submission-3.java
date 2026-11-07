class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int  i = 0; i < n; i++){
            if(binarySearch(matrix,target,i)){
                return true;
            }
        }
        return false;
    }
    public boolean binarySearch(int[][] matrix, int target,int row){
       int start = 0;
       int end = matrix[0].length - 1;
       while(start <= end){
        int mid = (start + end)/2;
        if(matrix[row][mid] == target ){
            return true;
        }
        if(matrix[row][mid] < target ){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
       }
       return false;

    }
}
