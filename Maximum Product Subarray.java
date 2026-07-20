class Solution {
    public int maxProduct(int[] nums) {
       int max=Integer.MIN_VALUE;
       int l=1;
       for(int i=0;i<nums.length;i++){
        l*=nums[i];
        if(l>max) max=l;
        if(nums[i]==0) l=1;
       }
       int r=1;
       for(int i=nums.length-1;i>=0;i--){
        r*=nums[i];
        if(r>max) max=r;
        if(nums[i]==0) r=1;
       }
         return max;
    }
}
