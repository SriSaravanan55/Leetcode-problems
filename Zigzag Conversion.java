class Solution {
    public String convert(String s, int numRows) {
       if(s.length()<=numRows || numRows==1) return s;
        String a[]=new String[numRows];
        for(int i=0;i<numRows;i++){
            a[i]="";
        }
        int c=0;
        boolean g=false;
        for(char j:s.toCharArray()){
            a[c]+=j;
            if(c==0 || c==numRows-1){
                g=!g;
            }
            c+=g?1:-1;
        }
        StringBuilder sb=new StringBuilder();
        for(String i:a){
            sb.append(i);
        }
        return sb.toString();
    }
}
