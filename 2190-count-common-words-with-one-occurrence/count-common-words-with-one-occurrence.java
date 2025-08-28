class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer>m1=new HashMap<>();
        Map<String,Integer>m2=new HashMap<>();
        for(String i:words1)
        {
            m1.put(i,m1.getOrDefault(i,0)+1);
        }
        for(String i:words2)
        {
            m2.put(i,m2.getOrDefault(i,0)+1);
        }
        ArrayList<String>l1=new ArrayList<>();
        for(Map.Entry<String,Integer>entry:m1.entrySet())
        {
            if(entry.getValue()==1)
            {
                l1.add(entry.getKey());
            }
        }
         for(Map.Entry<String,Integer>entry:m2.entrySet())
        {
            if(entry.getValue()==1)
            {
                l1.add(entry.getKey());
            }
        }
        Map<String,Integer>m3=new HashMap<>();
        for(String i:l1)
        {
            m3.put(i,m3.getOrDefault(i,0)+1);
        }
        int count=0;
         for(Map.Entry<String,Integer>entry:m3.entrySet())
        {
            if(entry.getValue()==2)
            {
                count++;
            }
        }
        return count;
    }
}