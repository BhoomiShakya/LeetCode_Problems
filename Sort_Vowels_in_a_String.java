class Solution {
    public String sortVowels(String s) { 
        return solution(s);
    }
    public static String solution(String s){
        ArrayList<Character> list= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(vowel(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        String ans="";
        int k=0;
        for(int i=0;i<s.length();i++){
            if(vowel(s.charAt(i))){
                ans+=list.get(k);
                k++;
            }
            else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
    public static boolean vowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}
