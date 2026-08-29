class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int high = nums.length-1;
        int mid = 0;
        while(mid <= high){
            if(nums[mid] == 0){
              swap(nums,mid,start);
              start++;
              mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}