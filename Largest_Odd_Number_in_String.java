class Solution {
    public String largestOddNumber(String num) {
        return solution(num);
    }
    public static String solution(String s){
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)%2!=0){
                    return s.substring(0,i+1);
                }
            }
            return "";
        }
}
