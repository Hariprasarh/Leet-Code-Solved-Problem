class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        int start=0;
        int end=n-1;
        char []arr=s.toCharArray();
        String str="aeiouAEIOU";
        while(start<end)
        {
            while(start<end && str.indexOf(arr[start])==-1)
            {
                start++;
            }
            while(start<end && str.indexOf(arr[end])==-1)
            {
                end--;
            }
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        String st=new String(arr);
        return st;
    }
}