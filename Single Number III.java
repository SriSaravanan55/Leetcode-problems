class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        List<Integer> li=new ArrayList<>();
        for(int i:m.keySet()){
            if(m.get(i)==1) li.add(i);
        }
        int arr[]=new int[li.size()];
        int j=0;
        for(int i:li) {
            arr[j++]=i;
        }
        return arr;
    }
}
