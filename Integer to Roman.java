class Solution {
    public String intToRoman(int num) {
        String s="";
        String n[]={"I","V","X","L","C","D","M","IV","IX","XL","XC","CD","CM"};
        int length = String.valueOf(num).length();
        int arr[]=new int[length];int j=0;int m=1;
        while(num>0 && j<length){
           int sum=num%10*m;
           m*=10;
           arr[j]=sum;j++;
           num=num/10;
        }
       for(int i=arr.length-1;i>=0;i--){
        int nums=arr[i];
        while(nums>0){
            if(nums>=1000 ||nums==900){
                if(nums==900){
                 s+=n[12];nums=0;
                  continue;
                 }
              s+=n[6];nums-=1000;
            }
            else if((nums>=500 && nums<=800) ||nums==400){
                if(nums==400) {
                    s+=n[11];nums=0;
                     continue;
                }
              s+=n[5];nums-=500;
            }
            else if((nums>=100 && nums<=300) ||nums==90){
                if(nums==90){
                     s+=n[10];nums=0;
                      continue;
                     }
              s+=n[4];nums-=100;
            }
            else if((nums>=50 && nums<=80) ||nums==40){
                if(nums==40){
                     s+=n[9];nums=0;
                      continue;
                     }
              s+=n[3];nums-=50;
            }
           else if((nums>=10 && nums<=30) ||nums==9){
                if(nums==9) {
                    nums=0;s+=n[8];
                     continue;
                }
              s+=n[2];nums-=10;
            }
           else if((nums>=5 && nums<=8) ||nums==4){
                if(nums==4) {
                    s+=n[7];nums=0;
                     continue;
                }
              s+=n[1];nums-=5;
            }
           else if((nums>=1 && nums<=3) ){
              s+=n[0];nums-=1;
            }
       }}
    return s;
    }

}
