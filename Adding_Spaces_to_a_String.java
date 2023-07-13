class Solution {
    public String addSpaces(String s, int[]arr) {
      char[] ans = new char[s.length() + arr.length];
        char[] ch = s.toCharArray();
        int spaceCount = 0; 
        for (int i = 0, j = 0; i < ch.length; i++, j++) {
            if (spaceCount < arr.length && i == arr[spaceCount]) {
                ans[j] = ' '; 
                j++; 
                spaceCount++;
            }
            ans[j] = ch[i];
        }
        return new String(ans);   
    }
}
