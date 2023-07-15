class Solution {
    public int maxPower(String s) {
        return solution(s);
    }
    public static int solution(String s){
        int max=0;
        int cnt=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                cnt++;
            }
            else{
                max=Math.max(cnt,max);
                cnt=1;
            }
        }
        max=Math.max(cnt,max);
        return max;
    }
}
