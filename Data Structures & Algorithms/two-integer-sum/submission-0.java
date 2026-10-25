class Solution {
    public int[] twoSum(int[] nums, int target) {
        int difference=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            difference=target-nums[i];
            if(h.containsKey(difference)) return new int[]  {h.get(difference), i} ;
                h.put(nums[i], i);
        }
          return new int[] {};
    }
}
