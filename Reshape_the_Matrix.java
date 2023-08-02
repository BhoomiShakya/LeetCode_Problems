class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        return solution(mat,r,c);   
    }
    public static int[][] solution(int [][]arr, int r , int c){
        if(r*c!= arr.length*arr[0].length){
            return arr;
        }
        int x=0;
        int y=0;
        int[][]ans=new int[r][c];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                ans[x][y]=arr[i][j];
                y++;
                if(y==c){
                    y=0;
                    x++;
                }
            }
        }
        return ans;
    }
}
