class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> S=new HashSet<>();
        for(int i:nums){
            if(S.contains(i)) return true;
            else S.add(i);
        }
       return false;
    }
}
