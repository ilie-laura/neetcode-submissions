class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prod1=1;
        int prod2=1;
       
        int[] rez=new int[nums.length];
        for(int i=0;i<nums.length;i++){
                rez[i]=prod1;
                prod1*=nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){
            rez[i]*=prod2;
            prod2*=nums[i];
        }
return rez;
        
    }
}  
