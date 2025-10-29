class Solution {
    public int dominantIndex(int[] nums) {
        int l=-1;
        int in=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>l)
            {
                l=nums[i];
                in=i;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(j!=in && (l < 2*nums[j]))
            {
                return -1;
            }
        }
        return in;
    }
}