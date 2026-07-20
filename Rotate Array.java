class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int K=k%n;
        int arr[]=new int[n];
        int j=0;
        for(int i=n-K;i<n;i++){
            arr[j++]=nums[i];
        }
        for(int i=0;i<n-K;i++){
            arr[j++]=nums[i];
        }
        for(int i=0;i<n;i++){
          nums[i]=arr[i];
        }
    }
}
