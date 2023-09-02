class Solution {
    public long[] sumOfThree(long num) {
        return solution(num);
    }
    public static long[] solution (long n){
        if(n%3!=0){
            return new long[]{};
        }
        long a=n/3;
        return new long[]{a-1,a,a+1};
    }
}
