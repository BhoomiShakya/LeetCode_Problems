//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public int editDistance(String s, String t) {
        // Code here
        int[][]dp= new int[s.length()][t.length()];
        for(int []arr:dp){
            Arrays.fill(arr,-1);
        }
        return solution(s,t,0,0,dp);
    }
    public static int solution(String s1, String s2, int i, int j, int[][]dp){
        
        if(i==s1.length()){
            return s2.length()-j;
        }
        
        if(j==s2.length()){
            return s1.length()-i;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=solution(s1,s2,i+1,j+1,dp);
        }
        else{
            int delete=solution(s1,s2,i+1,j,dp);
            int insert=solution(s1,s2,i,j+1,dp);
            int replace= solution(s1,s2,i+1,j+1,dp);
            ans=Math.min(replace,Math.min(delete,insert))+1;
        }
        return dp[i][j]=ans;
    }
}