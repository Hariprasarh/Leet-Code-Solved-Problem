class Solution {
    public int findGCD(int[] nums) {
       Arrays.sort(nums);
       int k=nums[0];
       int j=nums[nums.length-1];
       int a=0;
       for(int i=1;i<=j;i++){
        if(k%i==0 && j%i==0){
                a=i;
        }
       } 
       return a;
    }
}