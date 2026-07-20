class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character,Character> m1=new HashMap<>();
        Map<Character,Character> m2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char v=t.charAt(i);                 
            if(m1.containsKey(c)){
            if(m1.get(c)!=v) return false;
            }
            else  m1.put(c,v);
            if(m2.containsKey(v)){
            if (m2.get(v)!=c) return  false;
            }
            else  m2.put(v,c);
        }
        return true;
    }
}
