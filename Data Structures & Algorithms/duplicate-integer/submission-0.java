class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> fr=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            
            if( !fr.add(nums[i])) return true;
        }
        return false;
    }
}