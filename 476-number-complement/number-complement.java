class Solution {
    public int findComplement(int n) {
        String b = Integer.toBinaryString(n);
        String count="";
        for(int i=0;i<b.length();i++)
        {
            if(b.charAt(i)=='1')
            {
                count+='0';
            }
            else
            {
                count+='1';
            }
        }
        return Integer.parseInt(count,2);
    }
}