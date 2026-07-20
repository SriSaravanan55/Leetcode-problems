class Solution {
    public int singleNumber(int[] nums) {int ans=0;int  count=0;
        int sin=0;
        for(int a:nums){
            sin^=a;
        }
        return sin;
    }
}
