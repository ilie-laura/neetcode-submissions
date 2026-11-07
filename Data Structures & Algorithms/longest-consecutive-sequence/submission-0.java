class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0) return 0;
       HashSet<Integer> numsh = new HashSet<>();

        for (int n : nums) {
            numsh.add(n);
        }
        
        int maxStreak=0;
        for(int el : numsh){
            if(!numsh.contains(el-1)){
                int curr=el;
                int s=1;

                while(numsh.contains(curr+1)){
                    s++;
                    curr++;
                }
                maxStreak=Math.max(maxStreak,s);

            }
        }
        return maxStreak;
    }
} 
