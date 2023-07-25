class Solution {
    public int arithmeticTriplets(int[]arr, int d) {
         int c=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if((arr[j]-arr[i]==d) && (arr[k]-arr[j]==d)){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}
