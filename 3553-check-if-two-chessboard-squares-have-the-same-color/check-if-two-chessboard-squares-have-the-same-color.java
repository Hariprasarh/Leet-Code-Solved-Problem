class Solution {
    public boolean checkTwoChessboards(String co1, String co2) {
        int a=co1.charAt(0)+co1.charAt(1);
         int b=co2.charAt(0)+co2.charAt(1);
         if(a%2==b%2)
         {
            return true;
         }
         return false;
        
    }
}