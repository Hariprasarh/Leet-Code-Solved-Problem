class Solution {
    public int addDigits(int n) {
        if(n%9==0&&n!=0)
         return 9;
        else
         return n%9;
    }
}