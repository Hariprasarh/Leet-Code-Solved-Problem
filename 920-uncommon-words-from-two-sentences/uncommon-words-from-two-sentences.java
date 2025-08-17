class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer>map=new HashMap<>();
        ArrayList<String>l1=new ArrayList<>();
        ArrayList<String>l2=new ArrayList<>();
        String arr1[]=s1.split(" ");
        String arr2[]=s2.split(" ");
        for(String i:arr1)
        {
            l1.add(i);
        }
        for(String i:arr2)
        {
            l1.add(i);
        } 
        for(String i:l1)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<String,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                l2.add(entry.getKey());
            }
        }
        return l2.stream().toArray(String[]::new);
    }
}