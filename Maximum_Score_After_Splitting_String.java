class Solution {
    public int maxScore(String s) {
        return solution(s);
    }
 public static int solution(String s){
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            int z=0;
            int o=0;
            for(int j=0;j<=i;j++){
                if(s.charAt(j)=='0'){
                    z++;
                }
            }
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    o++;
                }
            }
            if(ans<z+o){
                ans=z+o;
            }
        }
        return ans;
    }
}
