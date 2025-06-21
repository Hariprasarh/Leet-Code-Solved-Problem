class Solution {
    public int maxCoins(int[] pi){
        Arrays.sort(pi);
        int ans=0;
        int n=pi.length;
        for(int i=n/3;i<n;i+=2)
        {
            ans+=pi[i];
        }
        return ans;
    }
}