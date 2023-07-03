class Solution {
    public boolean isSameAfterReversals(int num) {
        return solution(num);
    }
    public static boolean solution(int n){
       int temp=n;
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        int rr=reverse2(ans);
        if(rr==temp){
            return true;
        }
        return false;

    }
    public static int reverse2(int n){
        int ans1=0;
        while(n>0){
            int rem=n%10;
            ans1=ans1*10+rem;
            n=n/10;
        }
        return ans1;
    }
}
