class Solution {
    public boolean canAliceWin(int[] nums) {
        int add=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=9)
            {
                add+=nums[i];
            }
            else
            {
                sum+=nums[i];
            }
        }
            if(sum==add)
            {
                return false;
            }
                return true;

        
    }
}