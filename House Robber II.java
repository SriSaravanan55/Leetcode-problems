class Solution {
    public int rob(int[] nums) {
        int size=nums.length;
        if(size==1) return nums[0];
        if(size==2) return Math.max(nums[0],nums[1]);
        int res1=costcal(nums,0,size);
        int res2=costcal(nums,1,size);
        return Math.max(res1,res2);
    } 
   static int costcal(int []nums,int start,int size){
     int []dpcost=new int[size-1];
    dpcost[0]=nums[start];
    dpcost[1]=Math.max(nums[start],nums[1+start]);
    for(int i=2;i<size-1;i++){
        dpcost[i]=Math.max(dpcost[i-2]+nums[i+start],dpcost[i-1]);
    }
    return dpcost[size-2];
    
   }
}
