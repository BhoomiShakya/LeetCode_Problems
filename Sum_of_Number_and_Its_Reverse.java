class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        return solution(num);
    }
     public static boolean solution(int n){
        if(n==0){
            return true;
        }
        int i=0;
        while(i<n){
            int rev=reverse(i);
            if((i+rev)==n){
                return true;
            }
            i++;
        }
        return false;
    }
    public static int reverse(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        return sum;
    }
}
