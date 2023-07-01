class Solution {
    public void setZeroes(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int []r=new int[m];
        int []c=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    r[i]=1;
                    c[j]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(r[i]==1 || c[j]==1){
                    arr[i][j]=0;
                }
            }
        } 
    }
}
