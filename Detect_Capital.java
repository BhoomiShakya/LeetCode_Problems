class Solution {
    public boolean detectCapitalUse(String s) {
        int low=0;
        int upp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                upp++;
            }
            else{
                low++;
            }
        }
        if(upp==s.length()){
            return true;
        }
        else if(low==s.length()){
            return true;
        }
        else if((s.charAt(0)>='A' && s.charAt(0)<='Z')&& (upp==1)){
            return true;
        }
        return false;
    }
}
