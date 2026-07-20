class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int i:m.keySet()){
            if(m.get(i)==1) ans=i; 
        }
        return ans;
    }
}
