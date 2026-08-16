class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i =0; i < matrix.length ; i++){
            if(binarySearch(matrix, target, i)) return true;
        }
        return false;
    }
    public static boolean binarySearch(int[][] matrix, int target, int row){
        int s =0;
        int e = matrix[0].length-1;
        while(s <= e ){
            int mid  = (s+e)/2;
            if(matrix[row][mid] == target){
                 return true;
            }
            if(matrix[row][mid] > target){
                e = mid - 1;
            }else{
                s = mid +1;
            }
        }
        return false;

    }
}
