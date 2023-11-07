class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int[][]dp=new int[arr.length][arr[0].length];
        if(arr[0][0] == 1)
            return 0;
        for(int []a:dp){
            Arrays.fill(a,-1);
        }
        
        return solution(arr,0,0,dp);
    }
    public static int solution(int [][]arr, int i, int j , int[][]dp){
        int m=arr.length;
        int n=arr[0].length;        
        if(i>=m || j>=n){
            return 0;
        }
        
        if(arr[i][j]==1){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        
        if(dp[i][j] != -1){
           return  dp[i][j];
        }

        int r=solution(arr,i+1,j,dp);
        int d=solution(arr,i,j+1,dp);
        return dp[i][j]=r+d;
    }
}
