class Solution {
    public boolean closeStrings(String word1, String word2) {
        return solution(word1, word2);
    }
    public static boolean solution(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        return solution1(s1,s2);
    }
    public static boolean solution1(String s1, String s2){
        int []fre1= new int[26];
        int []fre2= new int[26];
        for(int i=0;i<s1.length();i++){
            fre1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            fre2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if((fre1[i]==0 && fre2[i]!=0) || (fre2[i]==0 && fre1[i] !=0)){
                return false;
            }
        }
        Arrays.sort(fre1);
        Arrays.sort(fre2);
        if(Arrays.equals(fre1, fre2)){
            return true;
        }
        return false;
    }
}
