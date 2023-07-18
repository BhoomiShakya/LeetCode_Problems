class Solution {
    public String capitalizeTitle(String title) {
        return solution(title);
    }
   public static String solution(String s){
        s=s.toLowerCase();
        String ans="";
        String []arr=s.split("\\s");
        for(int i=0;i<arr.length;i++){
            String str= capital(arr[i]);
            ans=ans+str+" ";
        }
        return ans.trim();
    }
    public static String capital(String str){
       String res="";
        if(str.length()==1 || str.length()==2){
            res = res+str.substring(0, 1).toLowerCase() + str.substring(1);
        }
        else{
            res = res+str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return res;
    }
}
