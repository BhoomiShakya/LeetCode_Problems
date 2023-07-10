class Solution {
    public String reversePrefix(String s, char ch) {
         int idx=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                idx=i;
                break;
            }
        }
        String ans="";
        for(int i=idx;i>=0;i--){
            ans+=s.charAt(i);
        }
        for(int i=idx+1;i<s.length();i++){
            ans+=s.charAt(i);
        }
        //System.out.println(ans);
        return ans;
    }
}
