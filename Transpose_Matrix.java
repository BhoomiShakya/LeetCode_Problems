class Solution {
    public int[][] transpose(int[][]arr) {
          int n=arr.length;
          int m=arr[0].length;
        int [][]trr= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                trr[i][j]=arr[j][i];
            }
        }
        return (trr);
    }
}
