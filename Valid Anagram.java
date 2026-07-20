class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[]=new int [26];
        for(int i:s.toCharArray()){
            arr[i-'a']++;
        }
        for(int c:t.toCharArray()){
            arr[c-'a']--;
        }
        for(int i:arr){
            if(i!=0) return false;
        }
        return true;
    }
}
