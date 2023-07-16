class Solution {
    public int getLucky(String s, int k) {
        return solution(s,k);
    }
     public static int solution(String s, int k){
       int sum=0;
       for(int i=0; i<s.length();i++){
            sum=sum+digits(s.charAt(i)-'a'+1);
       }
       while(--k>0){
        sum=digits(sum);
       }
       return sum;
       //System.out.println(sum);
    }
    public static int digits(int n){
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
}
