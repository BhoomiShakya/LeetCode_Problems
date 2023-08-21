class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String n=s+s;
        return n.substring(1,n.length()-1).contains(s);
    }
}
