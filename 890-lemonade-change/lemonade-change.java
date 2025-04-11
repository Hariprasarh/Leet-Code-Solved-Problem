class Solution {
    public boolean lemonadeChange(int[] arr) {
       int count1=0;
       int count2=0;
       int count3=0;
        for(int i=0;i<arr.length;i++)
        {
            int amount=arr[i];
            if(arr[i]==5)
            {
                count1++;
            }
            else if(amount==10)
            {
                count2++;
                if(count1>0)
                {
                    count1--;
                }
                else{
                return false;
                }
            }
            else
            {
                count3++;
                if(count2>0&&count1>0)
                {
                    count2--;
                    count1--;
                }
                else if(count1 >=3)
                {
                    count1--;
                    count1--;
                    count1--;
                }
                else{
                return false;
                }
            }
        }
        
    return true;
    }
}