class Solution {
    public int countPrimeSetBits(int left, int right) {
        return solution(left,right);
    }
    public static int solution(int l, int r){
        int cnt_prime=0;
        for(int i=l;i<=r;i++){
            String num=Integer.toBinaryString(i);
            int cnt_1=counts(num);
            if(check(cnt_1)){
                cnt_prime++;
            }
        }
        return cnt_prime;
    }
    public static int counts(String s){
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                cnt++;
            }
        }
        return cnt;
    }
    public static boolean check(int c){
        if (c < 2) {
            return false;
        }
        for (int i = 2; i * i <= c; i++) {
            if (c % i == 0) {
                return false;
            }
        }
        return true;
    }
}
