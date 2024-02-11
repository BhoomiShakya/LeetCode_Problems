class Solution {
    public int cherryPickup(int[][] grid) {
        int[][][]dp = new int[grid.length+1][grid[0].length+1][grid[0].length+1];
        for(int [][]arr:dp){
            for(int []a:arr){
                Arrays.fill(a,-1);
            }
        }
        return solution(grid, 0,0,grid[0].length-1,dp);    
    }
    public static int solution(int[][] arr, int curr, int colA, int colB, int[][][] dp) {
        if (colA < 0 || colB < 0 || colA >= arr[0].length || colB >= arr[0].length) {
            return 0;
        }
        if (curr == arr.length) {
            return 0;
        }
        if (dp[curr][colA][colB] != -1) {
            return dp[curr][colA][colB];
        }
        int r = 0;
        r += arr[curr][colA];
        if (colA != colB) 
            r += arr[curr][colB];
        int maxi = 0;
        for (int i = colA - 1; i <= colA + 1; i++) {
            for (int j = colB - 1; j <= colB + 1; j++) {
                maxi = Math.max(maxi, solution(arr, curr + 1, i, j, dp));
            }
        }
        r += maxi;
        return dp[curr][colA][colB] = r;
    }
}
