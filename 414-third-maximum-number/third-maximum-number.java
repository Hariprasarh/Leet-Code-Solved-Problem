class Solution {
    public int thirdMax(int[] nums) {
        long m1=Long.MIN_VALUE;
        long m2=Long.MIN_VALUE;
        long m3=Long.MIN_VALUE;
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums)
        {
            if(i==m1 || i==m2 || i==m3)continue;
            set.add(i);
            if(i>m1)
            {
                m3=m2;
                m2=m1;
                m1=i;
            }
            else if(i>m2)
            {
                m3=m2;
                m2=i;
            }
            else if(i>m3)
            {
                m3=i;
            }
        }
        return (m3==Long.MIN_VALUE)?(int)m1:(int)m3;
    }
}