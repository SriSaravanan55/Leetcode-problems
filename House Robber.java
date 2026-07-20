class Solution {
    public int rob(int[] nums) {
    int size =nums.length;
    if(size==1) return nums[0];
    int []dpcost=new int[size];
    dpcost[0]=nums[0];
    dpcost[1]=Math.max(nums[0],nums[1]);
    for(int i=2;i<size;i++){
        dpcost[i]=Math.max(dpcost[i-2]+nums[i],dpcost[i-1]);
    }
    return dpcost[size-1];
    }
}
