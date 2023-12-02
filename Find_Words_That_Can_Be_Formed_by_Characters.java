class Solution {
    public int countCharacters(String[] words, String chars) {
        return solution(words,chars);
    }
     public static int solution(String []arr, String ch){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(check(arr[i], ch)){
                ans+=arr[i].length();
            }
        }
        return ans;
    }
    public static boolean check(String str2, String str1){
        int[] ans = new int[256];
        for (char c : str1.toCharArray()) {
            ans[c]++;
        }
        for (char c : str2.toCharArray()) {
            if (ans[c] == 0) {
                return false; 
            }
            ans[c]--;
        }

        return true;
    }
}
