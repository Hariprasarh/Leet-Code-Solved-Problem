class Solution {
    public boolean canConstruct(String ran, String mag) {
        int n=ran.length();
        int m=mag.length();
        int arr[]=new int[26];

        for(int i=0;i<m;i++){
            arr[mag.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++)
        {
            if(--arr[ran.charAt(i)-'a']<0)
            {
                return false;
            }
        }
        return true;
    }
}