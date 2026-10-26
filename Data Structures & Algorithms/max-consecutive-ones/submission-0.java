class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int curmax=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]==1) curmax++;
        else if(nums[i]==0 ){
            max=Math.max(max,curmax);
            curmax=0;
        }
         max=Math.max(max,curmax);   
        }
        return max;
    }
}