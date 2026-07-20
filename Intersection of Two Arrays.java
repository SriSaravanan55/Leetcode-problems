class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> n1= new HashSet<>();
        Set<Integer> ans= new HashSet<>();
        for(int i:nums1) n1.add(i);
        for(int i:nums2){
            if(n1.contains(i)) ans.add(i);
        }
        int ans1[]=new int[ans.size()];int j=0;
        for(int i:ans) {
            ans1[j]=i;j++;
        }
        return ans1;
    }
}
