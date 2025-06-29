class Solution {
    public boolean detectCapitalUse(String word) {
        int n= word.length();
        int count1=0;
        int count2=0;
        if(n==1)
        {
            return true;
        }
        for(int i=0;i<n;i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                count1++;
            }
        }
        if(count1==n ||count1==0||count1==1&&Character.isUpperCase(word.charAt(0)))
        {
            return true;
        }
        return false;
    }
}