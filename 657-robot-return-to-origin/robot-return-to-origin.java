class Solution {
    public boolean judgeCircle(String moves) {
        int u=0;
        int d=0;
        int l=0;
        int r=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
            {
                u++;
            }
            if(moves.charAt(i)=='D')
            {
                d++;
            }
            if(moves.charAt(i)=='L')
            {
                l++;
            }
            if(moves.charAt(i)=='R')
            {
                r++;
            }
        }
        if(u==d&&l==r)
        {
            return true;
        }
        return false;
        
    }
}