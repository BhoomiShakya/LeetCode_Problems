class Solution {
    public void rotate(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i!=j){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
       for(int i=0;i<arr.length;i++){
            int row=0;
            int col=arr[0].length-1;
            while(row<=col){
                int temp=arr[i][col];
                arr[i][col]=arr[i][row];
                arr[i][row]=temp;
                col--;
                row++;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
        }
    }
}
