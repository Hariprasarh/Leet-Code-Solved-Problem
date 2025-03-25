class Solution {
    public int subtractProductAndSum(int n) {
        int rem=0;
        int mul=1;
        int add=0;
        while(n!=0)
        {
          rem=n%10;
          n/=10;
          mul*=rem;
          add+=rem;

        }
        return mul-add;
        
    }
}