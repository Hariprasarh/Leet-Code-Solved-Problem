class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int a=nums[0];
        int n=nums.length;
        int min=nums[n-1];
        for(int i=1;i<=min;i++)
        {
            if(min%i==0 && a%i==0)
            {
                    max=i;
            }
        }
        return max;
    }
}