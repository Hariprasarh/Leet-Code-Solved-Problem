class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int end=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=0)
            {
                int temp=nums[j];
                nums[j]=nums[end];
                nums[end]=temp;
                end++;
            }
        }
    }
}