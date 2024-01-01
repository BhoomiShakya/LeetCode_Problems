class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=g.length-1;
        int j=s.length-1;
        int ans=0;
       while(j>=0 && i>=0){
            if(s[j]>=g[i]){
                ans++;
                j--;
                i--;
            }
            else{
                i--;
            }
        }
        return ans;
    }
}
