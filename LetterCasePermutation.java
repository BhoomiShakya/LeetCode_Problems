class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list= new ArrayList<>();
        solution(list,s,"",0);
        return list;
    }
    public static void solution(List<String>list , String s, String ans, int idx){
        if(idx==s.length()){
            list.add(ans);
            return;
        }
        char ch=s.charAt(idx);
        if(ch >= 65 && ch <= 90){
            solution(list, s ,ans+s.charAt(idx),idx+1);
            solution(list, s ,ans+(char)(s.charAt(idx)+32), idx+1);
        }
        else if(ch>=97 && ch<=122){
            solution(list,s,ans+s.charAt(idx), idx+1);
            solution(list,s,ans+(char)(s.charAt(idx)-32), idx+1);
        }
        else{
            solution(list,s,ans+s.charAt(idx), idx+1);
        }
    }

}
