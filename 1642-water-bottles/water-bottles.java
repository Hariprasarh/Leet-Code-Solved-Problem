class Solution {
    public int numWaterBottles(int Bottles, int Exchange) {
        int sum=Bottles;
        while(Bottles>=Exchange)
        {
            int pal=Bottles/Exchange;
            int rem=Bottles%Exchange;
            sum=sum+pal;
            Bottles=pal+rem;
        }
        return sum;
    }
}