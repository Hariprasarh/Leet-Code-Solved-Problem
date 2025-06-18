class Solution {
    public boolean isAnagram(String s, String t) {
        // int arr[]=new int[26];
        // for(char c :s.toCharArray())
        // {
        //     arr[c-'a']++;
        // }
        // for(char c:t.toCharArray())
        // {
        //     arr[c-'a']--;
        // }
        // for(int n :arr)
        // {
        //     if(n!=0)
        //     {
        //         return false;
        //     }
        // }
        // return true;
        int a=s.length();
        int b=t.length();
        if(a!=b)
        {
            return false;
        }
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++)
        {
                if(arr1[i]!=arr2[i]){
                    return false;
            }
        }
        return true;
    }
}