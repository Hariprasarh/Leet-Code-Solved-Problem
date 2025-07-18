class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       Set<String>set=new HashSet<>();
       String []s= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       for(String i :words)
       {
        String st="";
          for(char ch :i.toCharArray())
          {
            st+=s[ch-'a'];
          }
          set.add(st);
       }
       return set.size();
    }
}