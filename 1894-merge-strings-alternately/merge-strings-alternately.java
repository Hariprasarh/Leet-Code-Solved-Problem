class Solution {
    public String mergeAlternately(String w1, String w2) {
        StringBuilder result=new StringBuilder();
        int i=0;
        while(i<w1.length()||i<w2.length())
        {
            if(i<w1.length()){
            result.append(w1.charAt(i));
        } 
        if(i<w2.length())
        {
            result.append(w2.charAt(i));
        }
        i++;
        }
        return result.toString();
        
    }
}