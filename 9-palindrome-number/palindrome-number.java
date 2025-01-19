class Solution {
    public boolean isPalindrome(int x) {
        int ans=0;
        int a=x;
        while(x>0){
            int res=x%10;
            ans=ans*10+res;
            x/=10;
        }
        System.out.print(ans);
        if(ans==a){
            return true;
        }
        else{
            return false;
        }
    }
}