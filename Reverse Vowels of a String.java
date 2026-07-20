class Solution {
    public String reverseVowels(String s) {
        char[]s1=s.toCharArray();int left=0;
        int right=s.length()-1;
        while(left<right){
            if(isVowel(s1[left]) && isVowel(s1[right])) {
            char temp=s1[left];
            s1[left]=s1[right];
            s1[right]= temp;
            left++;
            right--;
            }
            else if(!isVowel(s1[left])) left++;
            else{
           right--;
        }}
    return new String(s1);
}
 public static boolean isVowel(char y) {
        return y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u' ||
               y == 'A' || y == 'E' || y == 'I' || y == 'O' || y == 'U';
    }
}
