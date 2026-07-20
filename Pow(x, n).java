class Solution {
    public double myPow(double x, int n) {
        double ans=x;
        for(int i=2;i<=n;i++){
            ans*=x;
        }
        return ans;
    }
}
