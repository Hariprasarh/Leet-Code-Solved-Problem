class Solution {
    public int titleToNumber(String tle) {
      int ans=0;
      for(char i:tle.toCharArray())
      {
        ans=ans*26+(i-'A'+1);
      }
      return ans;
    }
}