class Solution {
    public int pivotInteger(int n) {
        return solution(n);    
    }
    public static int solution(int n){
        int sum=(n*(n+1))/2;
        int x=0;
        for(int i=1;i<=n;i++){
            x=x+i;
            if(sum-x+i == x){
                return i;
            }
        }
        return -1;
    }
}
