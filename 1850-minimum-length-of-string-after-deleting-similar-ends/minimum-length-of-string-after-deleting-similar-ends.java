class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        int start=0;
        int end=n-1;
        int count=0;
        while(start<end)
        {
            char ch=s.charAt(start);
            if(ch!=s.charAt(end))
            {
                break;
            }
            while(start<=end && s.charAt(start)==ch)
            {
            start++;
            }
            while(start<=end && s.charAt(end)==ch)
            {
            end--;
            }
        }
        return end-start+1;
    }
}