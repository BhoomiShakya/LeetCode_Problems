class Solution {
    public boolean isPowerOfThree(int n) {
        return solution(n);
    }
    public static boolean solution(int n){
        if(n==0 || n<0){
            return false;
        }
        while(n>1){
            if(n%3 != 0){
                return false; 
            }
            n=n/3;
        }
        return true;
    }
}
