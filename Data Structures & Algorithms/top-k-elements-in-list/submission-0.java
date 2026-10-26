class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        List<Integer>[] buckets=new List[n+1];

        Map<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        for(int i=0;i<=n;i++)
        buckets[i]=new ArrayList<>();
        
for(Map.Entry<Integer,Integer> entry: map.entrySet()){
    int num=entry.getKey();
    int fre=entry.getValue();
    buckets[fre].add(num);
}
int[] result = new int[k];
        int index = 0;
        
        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            if (!buckets[i].isEmpty()) {
                for (int num : buckets[i]) {
                    result[index++] = num;
                    if (index == k) 
                        break;
                    
                }
            }
        }
        return result;
    }
}
