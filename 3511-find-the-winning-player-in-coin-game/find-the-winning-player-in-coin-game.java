class Solution {
    public String winningPlayer(int x, int y) {
        int a=Math.min(x,y/4);
        if(a%2==1)
        {
            return "Alice";
        }
        return "Bob";
    }
}