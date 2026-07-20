class Solution {
    public int findDuplicate(int[] nums) {
        int ans=0;
        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            if(!s.contains(i)) s.add(i);
            else {
                ans=i;
                break;
            }
        }
        return ans;
    }
}
