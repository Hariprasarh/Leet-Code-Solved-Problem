class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String>list3=new ArrayList<>();
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<list1.length;i++)
        {
            for(int j=0;j<list2.length;j++)
            {
                if(list1[i].equals(list2[j]))
                {
                    list3.add(list2[j]);
                    int a=i+j;
                    map.put(list1[i],a);
                }
            }
        }
        if(list3.size()==1)
        {
             return list3.toArray(new String[0]);
        }
        int min=Integer.MAX_VALUE;
        for(Map.Entry<String,Integer>entry:map.entrySet())
        {
            if(entry.getValue()<min)
            {
                min=entry.getValue();
            }
        }
        List<String>list4=new ArrayList<>();
         for(Map.Entry<String,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==min)
            {
                list4.add(entry.getKey());
            }
        }
           return list4.toArray(new String[0]);
    }
}