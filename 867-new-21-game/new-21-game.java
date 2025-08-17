class Solution {
    public double new21Game(int n, int k, int max) {
     if(k==0||n>=k+max)
     {
        return 1.0;
     }   
     double[]dp=new double[n+1];
     dp[0]=1.0;
     double win=1.0;
     double res=0.0;
     for(int i=1;i<=n;i++)
     {
        dp[i]=win/max;
        if(i<k)
        {
            win+=dp[i];
        }
        else
        {
            res+=dp[i];
        }
        if(i-max>=0)
        {
            win-=dp[i-max];
        }
     }
     return res;
    }
}