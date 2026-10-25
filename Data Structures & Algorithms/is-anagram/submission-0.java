class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Hashtable<Character,Integer> fr_s=new Hashtable<>();
        Hashtable<Character,Integer> fr_t=new Hashtable<>();
            for(int i=0;i<s.length();i++){
                fr_s.put(s.charAt(i), fr_s.getOrDefault(s.charAt(i),0)+1);
                fr_t.put(t.charAt(i), fr_t.getOrDefault(t.charAt(i),0)+1);
            }
        return fr_s.equals(fr_t);
    }
}
