class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> set=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int st=nums[i];
            int mv=nums[i];
            while(i+1<n && mv+1==nums[i+1])
            {
                i++;
                mv++;
            }
            if(st !=nums[i])
            {
                set.add(String.valueOf(st)+"->"+String.valueOf(mv));
            }
            else
            {
                set.add(String.valueOf(st));
            }
        }
        return set;
    }
}