class Solution {
    public void sortColors(int[] nums) {
     for(int i=1;i<nums.length;i++){
       int t=nums[i];
       int j=i-1;
       while(j>=0 && nums[j]>t){
        nums[j+1]=nums[j];
        j--;
       }
       nums[j+1]=t;
     }
     
    }
}
