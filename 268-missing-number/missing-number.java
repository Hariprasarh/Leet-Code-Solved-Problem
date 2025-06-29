class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int add=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=i+1;
            add+=nums[i]; 
        }
        return sum-add;
        
    }
}