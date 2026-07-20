class Solution {
    public boolean wordPattern(String pattern, String s) {
        String Str[]=s.split(" ");
        if(pattern.length()!=Str.length) return false;
        Map<Character,String> m1=new HashMap<>();
        Map<String,Character> m2=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String S=Str[i];
            if(m1.containsKey(c)&&!m1.get(c).equals(S)) return false;
            if(m2.containsKey(S)&&!m2.get(S).equals(c)) return false;
            m1.put(c,S);m2.put(S,c);
        }
        return true;
    }
}
