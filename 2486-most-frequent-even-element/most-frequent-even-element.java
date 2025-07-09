class Solution {
    public int mostFrequentEven(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i :nums)
        {
            if(i%2==0 && map.containsKey(i))
            {
            map.put(i,map.getOrDefault(i,0)+1);
            }
            else if(i%2==0&& !map.containsKey(i))
            {
                map.put(i,1);
            }
        }
        int ans=-1;
        int count=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(count==entry.getValue())
            {
                ans=Math.min(ans,entry.getKey());
            }
            if(entry.getValue()>count)
            {
                count=entry.getValue();
                ans=entry.getKey();
            }
        }
        return ans;
    }
}