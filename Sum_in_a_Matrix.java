class Solution {
    public int matrixSum(int[][] arr) {
        int ans = 0;
        int n = arr.length;
        int m = arr[0].length;
        for(int[]val :arr)
        {
            Arrays.sort(val);
        }
        for(int i=0;i<m;i++)
        {
            int max = 0;
            for(int j=0;j<n;j++)
            {
                max = Math.max(max,arr[j][i]);
            }
            ans+=max;
        }
        return ans;
    }
}
