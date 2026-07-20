class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> li=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        for(int i:nums2) li.add(i);
        for(int i:nums1){
            if(li.contains(i)) {
                list.add(i);
                 li.remove(Integer.valueOf(i));
                }

        }
        int arr[]=new int[list.size()];
        int j=0;
        for(int i:list){
         arr[j++]=i;
        }
        return arr;
    }
}
