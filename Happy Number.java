class Solution {
    public boolean isHappy(int n) {
        while(n>=0){
       if(n==1||n==7) return true;
       else if(n<10) return false;
     n=ans(n);
    }return false;
    }
    public int ans(long a){
        int sum=0;
        while(a>0){
            sum+=(a%10)*(a%10);
            a/=10;
        }
     return sum;
    }
}
