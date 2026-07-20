class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len=nums1.length+nums2.length;
        int arr[]=new int[len];int indx=0;
      
        for(int i:nums1){
       arr[indx]=i;
       indx++;
        } 
         for(int i:nums2){
       arr[indx]=i;
       indx++;
        } 
       Arrays.sort(arr);
        double ans=0;
        if(len%2 !=0) ans= arr[len/2];
        else ans= (arr[len/2] + arr[(len-1)/2])/2.0;

    return ans;
    }
}
