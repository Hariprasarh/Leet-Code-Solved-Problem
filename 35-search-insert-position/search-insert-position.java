class Solution {
    public int searchInsert(int[] arr, int tar) {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=tar)
            {
                return i;
            }
        }
        return arr.length;
    }
}