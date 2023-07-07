class Solution {
    public String firstPalindrome(String[] arr) {
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            if(check(s)){
                return s;
            }
        }
        return "";
    }
    public static boolean check(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i) !=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
