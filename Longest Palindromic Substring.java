class Solution {
    public String longestPalindrome(String s) {
        String f="";
        int max=0;
        if(pali(s)) return s;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String str=s.substring(i,j+1);
                if(pali(str)){
                  int n=str.length();
                    if(max<n){
                     f=str;
                     max=n;
                }
                }
            }
        }
        return f;
    }
    public boolean pali(String s){
        if(s.length()==1) return true;
        int l=0,r=s.length()-1;
        boolean ans=false;
        while(l<=r){
            if(s.charAt(l)==s.charAt(r)) ans= true;
            else return false;
            l++;r--;
        }
        return ans;
    }
}
