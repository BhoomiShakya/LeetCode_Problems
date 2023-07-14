class Solution {
    public int smallestEvenMultiple(int n) {
        return solution(n); 
    }
     public static int solution(int n){
        if(n%2!=0){
            return n*2;
        }
        if(n%2==0){
            return n;
        }
        return 0;
    }
}
