class Solution {
    public int balancedStringSplit(String s) {
        int c1=0;
        int c2=0;
        for(char c:s.toCharArray())
        {
            if(c=='L')
            {
                c1++;
            }
            else if(c=='R')
            {
                c1--;
            }
            if(c1==0)
            {
                c2++;
            }
        }
            return c2;
    }
}