class Solution {
    public boolean checkPerfectNumber(int n) {
        int sum=0;
        if(n % 2 != 0){
            return false;
        }       
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            return true;
        }
        return false;
    }
}
