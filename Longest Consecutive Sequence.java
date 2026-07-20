class Solution {
    public int longestConsecutive(int[] nums) {
        int maxcount=0;
        if(nums.length==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
       for(int n:set){
            if(!set.contains(n-1)) {
               int st=n;
               int c=1;
               while(set.contains(st+1)){
                ++st;
                ++c;
               }
               maxcount =Math.max(maxcount,c);
        }
       }
        return maxcount;
    }
}
