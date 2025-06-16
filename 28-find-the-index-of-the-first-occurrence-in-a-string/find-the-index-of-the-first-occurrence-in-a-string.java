class Solution {
    public int strStr(String a, String b) {
        int n=a.length();
        int m=b.length();
        for(int i=0,j=m;j<=n;i++,j++)
        {
            if(a.substring(i,j).equals(b))
            {
                return i;
            }
        }
        return -1;
    }
}