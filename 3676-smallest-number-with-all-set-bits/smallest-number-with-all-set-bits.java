class Solution {
    public int smallestNumber(int n) {
        int a=Integer.highestOneBit(n);
        return (a<<1)-1;
    }
}