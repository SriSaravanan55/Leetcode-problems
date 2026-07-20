 class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero=0;
        int pro=1;
        int pro2=1;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            if(nums[i]!=0) pro2*=nums[i];

            pro*=nums[i];
        }
        if(zero>1) return arr;
        else if(zero==0){
            for(int i=0;i<nums.length;i++){
               arr[i]=pro/nums[i];
            }
        }
        else if(zero==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0) arr[i]=0;
                else arr[i]=pro2;
            }
        }
        return arr;
    }
}
