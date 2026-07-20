class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        for(int i:nums){
            int s=ans.size();
            for(int j=0;j<s;j++){
                 List<Integer> li=new ArrayList<>(ans.get(j));
                 li.add(i);
                ans.add(li);
            }
        }
        return ans;
    }
}
