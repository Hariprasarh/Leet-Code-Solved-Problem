class Solution {
    public int commonFactors(int a, int b) {
       int max=Integer.MIN_VALUE;
       if(a>b){
        max=a;
       } 
       else{
        max=b;
       }
       int g=0;
       for(int i=1;i<=max;i++){
        if(a%i==0 && b%i==0){
            g++;
        }
       }
       return g;
    }
}