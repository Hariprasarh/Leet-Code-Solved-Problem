class Solution {
    public int[] intersection(int[] n1, int[] n2) {
        Set<Integer> list=new HashSet<>();
        for(int i: n1)
        {
            list.add(i);
            // System.out.print(list);
        }
        Set<Integer> list1=new HashSet<>();
        for(int i: n2)
        {
            if(list.contains(i))
            {
                list1.add(i);
                // System.out.print(list1);
            }
        }
        int arr[]=new int[list1.size()];
        int index=0;
        for(int i : list1)
        {
            arr[index]=i;
            index++;
        }
        return arr;

    }
}