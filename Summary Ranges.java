class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> li=new ArrayList<>();
        int i=0;
        int n=nums.length;
        while(i<n){
            int start=nums[i];
            while(i+1<n  && nums[i]+1==nums[i+1]) 
            {
                i++;
            }
            if(start==nums[i]) li.add(""+start);
            else {
                li.add(start+"->"+nums[i]);
            }
            i++;
        }
        return li;
    }
}
