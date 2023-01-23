class Solution {
    public int alternateDigitSum(int n) {
        n=reversing(n);
        int e=0;// count of even digits
        int o=0;//count of odd digits
        int c=1;//count of places
        while(n>0){
            if(c%2==0){
                e+=n%10;
            }
            else{
                o+=n%10;
            }
            n=n/10;
            c++;
        }
        return o-e;
    
    }
     public static int reversing(int n){
        int r=0;
        while(n!=0){
            r= (r*10)+(n%10);
            n=n/10;
        }
        return r;
    }
}
