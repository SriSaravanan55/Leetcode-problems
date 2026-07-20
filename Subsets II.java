class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        for(int j:nums){
            
            int n=list.size();
            for(int i=0;i<n;i++){
                List<Integer> li=new ArrayList<>(list.get(i));
                li.add(j);
                if(!list.contains(li)) list.add(li);
            }
        }
        return list;
    }
}
