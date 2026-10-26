class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder sb=new StringBuilder();
        for (String s : strs) 
        sb.append(s.length()).append("#").append(s);
        
    return sb.toString();

    }

    public List<String> decode(String str) {
        
        List<String> rez=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#') j++;
            int length=Integer.parseInt(str.substring(i,j));
            String s=str.substring(j+1,1+j+length);
            rez.add(s);
            i=j+1+length;
        }
        return rez;
        
    }
}
