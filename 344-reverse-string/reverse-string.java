class Solution {
    public void reverseString(char[] s) {
        int L=0;
        int R=s.length-1;
        char temp='0';

        while(L<R){
            temp=s[L];
            s[L]=s[R];
            s[R]=temp;
            R--;
            L++;
        }
        
    }
}