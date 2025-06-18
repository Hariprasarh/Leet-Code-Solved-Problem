class Solution {
    public boolean isValid(String s) {
        int a=s.length();
        while(s.length()!=0)
        {
            if(s.contains("()"))
            {
               s= s.replace("()", "");
            }
            else if(s.contains("{}"))
            {
                s=s.replace("{}", "");
            }
            else if(s.contains("[]"))
            {
                s=s.replace("[]", "");
            }
            else
                return false;
        }
        return true;
    }
}