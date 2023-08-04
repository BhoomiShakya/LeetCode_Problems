class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        return solution(matrix);
    }
    public static boolean solution(int [][]arr){
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][j] != arr[i-1][j-1]){
                    return false;
                }
            }
        }

        return true;
    }
}
