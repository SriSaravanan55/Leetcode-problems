class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]) {
                ind=i;
                break;
            }
        }
        if(ind!=-1){
        for(int i=nums.length-1;i>ind;i--){
         if(nums[i]>nums[ind]){
             int temp=nums[ind];
        nums[ind]=nums[i];
        nums[i]=temp;
            break;
         }
        }
        }
       
            int l=ind+1;
            int r= nums.length-1;
            while(l<r){
                int te=nums[l];
                nums[l]=nums[r];
                nums[r]=te;
                r--;
                l++;
            }
        }
    }
