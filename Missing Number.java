class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> ans=new HashSet<>();
        int res=0;
        for(int i:nums) ans.add(i);
        int n=nums.length;
        for(int i=0;i<=n;i++){
            if(!ans.contains(i)) res=i;
        }
    return res;
    }
}
