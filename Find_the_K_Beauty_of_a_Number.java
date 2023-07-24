class Solution {
    public int divisorSubstrings(int num, int k) {
        return solution(num,k);
    }
     public static int solution(int n, int k){
       String s=Integer.toString(n);
       int c=0;
        for (int i = 0; i <= s.length() - k; i++) {
            String str = s.substring(i, i + k);
            boolean sol=divisible(str,n);
            if(sol){
                c++;
            }
        }
        return c;
    }
    public static boolean divisible(String s, int n){
        int a=Integer.parseInt(s);
        if(a==0){
            return false;
        }
        if(n%a==0){
            return true;
        }
        return false;
    }
}
