class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int i :nums)
        {
            set.add(i);
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(!set.contains(i+1) && (i+1)!=nums[i])
            {
                list.add(i+1);
            }
        }
        return list;

    }
}