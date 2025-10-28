class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i : nums)
        {
            set.add(i);
        }
        List<Integer>l=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==2)
            {
                l.add(entry.getKey());
            }
        }
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=i+1;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(arr[i]))
            {
                l.add(arr[i]);
            }
        }
        int arr2[]=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            arr2[i]=l.get(i);
        }
        return arr2;
    }
}