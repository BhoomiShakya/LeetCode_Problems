class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0){
            return "";
        }
        String long_palin="";
        for(int i=0;i<s.length();i++){
            String palin=expand(s,i,i);
            if(palin.length()>long_palin.length()){
                long_palin=palin;
            }
            palin=expand(s,i,i+1);
            if(palin.length()>long_palin.length()){
                long_palin=palin;
            }
        }   
        return long_palin;   
    }
    public static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }
    public static boolean palindrom(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
