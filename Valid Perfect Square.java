class Solution {
    public boolean isPerfectSquare(int num) {
    //     int max =(int)Math.sqrt(num);
    //     int res=max*max;
    //      if(res==num) return true;
    //  return false;
    return (long)Math.sqrt(num)*(long)Math.sqrt(num)==num;
    }
}

