class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int max=0;
        int count=0;
        for(int i:m.keySet()){
            if(count<m.get(i)) {
                max=i;
                count=m.get(i);
            }
        }
        return max;
    }
}
