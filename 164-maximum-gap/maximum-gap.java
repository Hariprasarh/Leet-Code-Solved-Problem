class Solution {
    public int maximumGap(int[] nums) {
       if(nums.length<2){
        return 0;
       } 
       Arrays.sort(nums);
       int max=Integer.MIN_VALUE;
       for(int i=1;i<nums.length;i++){
        int a=Math.abs(nums[i]-nums[i-1]);
        if(a>max){
            max=a;
        }
       }
       return max;
    }
}