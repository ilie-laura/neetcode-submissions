class Solution {
    public boolean isPalindrome(String s) {
        if(s==null) return true;
        int left=0;
        int right=s.length()-1;

        while(left<right){
          char cst=s.charAt(left);
          char cr=s.charAt(right);
            if(!Character.isLetterOrDigit(cst)) left++;
                else 
                    if(!Character.isLetterOrDigit(cr)) right--;
                else {if (Character.toLowerCase(cst)!= Character.toLowerCase(cr))return false;    

            right--;
            left++;
                }
        }
        return true;
    }
    
}
