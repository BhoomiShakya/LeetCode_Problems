class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        return solution(image);   
    }
    public static int[][]solution(int [][]arr){
        int [][]res= new int [arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                res[i][j]=arr[i][arr[0].length-j-1];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(res[i][j]==1){
                    res[i][j]=0;
                }
                else{
                     res[i][j]=1;
                }
            }
        }
        return res;
    }
}
