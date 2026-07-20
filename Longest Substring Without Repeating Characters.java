class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> li=new HashSet<>();
        int max=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(li.contains(c)){
                li.remove(s.charAt(l));
                l++;
            }
            li.add(c);
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}
