class Solution {
    public int myAtoi(String s) {
        int ans=0;int sign=1;
       
       s= s.trim();
        if(s.length()==0) return 0;
        int j=0;
        if(s.charAt(0)=='-') {
                  sign=-1;
                  j++;
            }
            else if(s.charAt(0)=='+'){
                sign=1;
                j++;
            }
        for(int i=j;i<s.length();i++){
            char ch=s.charAt(i);
           
            if(ch<'0'||ch>'9') break;
             int digit=ch-'0';
             if(ans>Integer.MAX_VALUE / 10 || (ans==Integer.MAX_VALUE / 10 && digit>7)){
                return sign==1?Integer.MAX_VALUE :Integer.MIN_VALUE;
             }
            ans=ans*10+digit;

            }
            
        
        return ans*sign;
    }
}
