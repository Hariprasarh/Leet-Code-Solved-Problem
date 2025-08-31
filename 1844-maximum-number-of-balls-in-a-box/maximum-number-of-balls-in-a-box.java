class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer,Integer>map=new HashMap<>();
        int max=0;
        for(int i=lowLimit;i<=highLimit;i++)
        {
           int box=getBoxnum(i);
           map.put(box,map.getOrDefault(box,0)+1);
           max=Math.max(max,map.get(box)); 
        }
        return max;
    }
    public int getBoxnum(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=(n%10);
            n/=10;
        }
        return sum;
    } 
}