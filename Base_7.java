class Solution {
    public String convertToBase7(int num) {
        return solution(num);
    }
    public static String solution(int n){
        String ans="";
        int c=0;
        if(n==0){
            return "0"+ans;
        }
        if(n<0){
            n=n*(-1);
            c++;
        }
        while(n>0){
            int rem=n%7;
            ans=rem+ans;
            n=n/7;
        }
        if(c>0){
            return "-"+ans;
        }
        return ans;
    }
}
