class Solution {
    public int countGoodSubstrings(String s) {
         ArrayList< String> list= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<=s.length();j++){
                String str=s.substring(i, j);
                if(str.length()==3){
                    list.add(s.substring(i, j));
                }
            }
        }
        ArrayList< String> ans= new ArrayList<>();
        for(int i=0;i<list.size();i++){
            String str=list.get(i);
            if(str.charAt(0)!=str.charAt(1) &&  str.charAt(0)!=str.charAt(str.length()-1) &&  str.charAt(1)!=str.charAt(str.length()-1)){
                ans.add(str);
            }
        }
         return ans.size();
    }
}
