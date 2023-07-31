class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1=solution(s);
        String s2=solution(t);
        return (s1.equals(s2));
    }
    public static String solution(String s){
        int cnt=0;
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                cnt++;
            }
            else{
                if(cnt==0){
                    ans=s.charAt(i)+ans;
                }
                else{
                    cnt--;
                }
            }
        }
        return ans;
    }
}
