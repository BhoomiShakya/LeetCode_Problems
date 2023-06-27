class Solution {
    public boolean arrayStringsAreEqual(String[] s1, String[] s2) {
        String ans1="";
        String ans2="";
        for(int i=0;i<s1.length;i++){
            ans1+=s1[i];
        }
        for(int i=0;i<s2.length;i++){
            ans2+=s2[i];
        }
        if(ans1.equals(ans2)){
            return true;
        }
        return false;
    }
}
