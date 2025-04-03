class Solution {
    public int addDigits(int n) {
        if(n==0)
        {
            return 0;
        }
        int rem=0;
        while(n!=0)
        {
            rem+=n%10;
            n/=10;
        }
        if(rem>=10)
        {
            return addDigits(rem);
        }
        else
        {
            return rem;
        }
    }
}