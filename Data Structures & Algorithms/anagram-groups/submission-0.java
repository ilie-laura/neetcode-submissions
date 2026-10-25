class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] fr=new int[26];
            for(char c:s.toCharArray()){
                fr[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int c : fr) {
                sb.append('#').append(c);
            }
            String key = sb.toString();

          map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
