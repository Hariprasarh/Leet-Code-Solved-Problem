class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int right=0;
        int left=n;
        int[]arr=new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='I') {
                arr[i]=right++;
            }
            else{
                arr[i]=left--;
            }
        }
        arr[n]=left;
        return arr;
    }
}