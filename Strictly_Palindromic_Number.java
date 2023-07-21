class Solution {
    public boolean isStrictlyPalindromic(int n) {
        return solution(n);

    }
    public static boolean solution(int n){
        for(int i=2;i<=n-2;i++){
            if( !check(Integer.toString(n,i))){
            return false;

            }   
        }
        return true;
      }
      
      public static boolean check(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
                
            }
            i++;
            j--;
        }
        return false;
      }
}
