class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int lef[]=new int[n];
        int rig[]=new int [n];
        int trep=0;
        lef[0]=height[0];
        for(int i=1;i<n;i++)
        {
            lef[i]=Math.max(lef[i-1],height[i]);
        }
        rig[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rig[i]=Math.max(rig[i+1],height[i]);
        }
        for(int i=0;i<n;i++)
        {
            trep+=Math.min(lef[i],rig[i])-height[i];
        }
        return trep;
    }
}