class Solution {
    public int numJewelsInStones(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
       int count=0;
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                count++;
            }
        }
       }
       return count;
    }
}