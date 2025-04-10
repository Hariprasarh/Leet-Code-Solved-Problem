class Solution {
    public int singleNumber(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        { 
            count=0;
        int j=0;
        while(j<n)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
                j++;
            }
            if(count==1)
            {
                return arr[i];
            }
        }
        return 0;
    }
}