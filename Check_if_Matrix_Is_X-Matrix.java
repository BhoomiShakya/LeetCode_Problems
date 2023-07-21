class Solution {
    public boolean checkXMatrix(int[][] grid) {
        return solution(grid);
    }
    public static boolean solution(int [][]arr){    
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j || i+j==arr.length-1){
                    if(arr[i][j]==0){
                        return false;
                    }
                }
                else{
                    if(arr[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
