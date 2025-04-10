class Solution {
    public int singleNumber(int[] arr) {
        int n=arr.length;
        int count=0;
        int i=0;
        while(i<n)
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
            i++;
        }
        return 0;
    }
}