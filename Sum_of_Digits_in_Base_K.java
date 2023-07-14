class Solution {
    public int sumBase(int n, int k) {
       return solution(n,k);
    }
    public static int solution(int n, int k){
        int res=0;
        while(n>0){
            int rem=n%k;
            res=res*10+rem;
            n=n/k;
        }
       int ans=  digi_sum(res);
       return ans;
    }
    public static int digi_sum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
}
