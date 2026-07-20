class Solution {
    public int divide(int dividend, int divisor) {int sum=0;
        if(dividend==Integer.MIN_VALUE && divisor==-1) sum= Integer.MAX_VALUE;
        else sum =dividend/divisor;
        return sum;
    }
}
