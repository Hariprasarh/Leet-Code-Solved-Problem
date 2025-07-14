class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        String str=s+s;
        String str1=str.substring(1,str.length()-1);
        if(str1.contains(s))
        {
            return true;
        }
        return false;
    }
}