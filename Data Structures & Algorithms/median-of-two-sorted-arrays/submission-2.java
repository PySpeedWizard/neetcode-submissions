class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int max = 0;
        int[] ans = new int[nums1.length+nums2.length];
        int j =0;
        for(int i : nums1){
             ans[j] =i;
             j++;
        }
        for(int i : nums2){
            ans[j] = i;
            j++;
        }
       Arrays.sort(ans);
       double result ;
       int n  = ans.length;
       int mid = n/2;
       if(n %2 ==0){
           
           result = (double)(ans[mid]+ans[mid-1])/2;

       }else{
           result =(double) ans[mid];
       }
       
        return result;

    }
}
