class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        if(n!=goal.length())
        {
            return false;
        }
        String str=s+s;
        String str2=s.substring(1,n);
        if(str.contains(goal))
        {
            return true;
        }
        return false;
    }
}