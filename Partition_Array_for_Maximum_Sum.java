class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
       int []dp = new int[arr.length];
       Arrays.fill(dp,-1);
        return solution(arr,k,0, dp);
    }
    public static int solution(int []arr, int k, int idx, int []dp){
        if(idx==arr.length){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int len=0;
        int maxi=Integer.MIN_VALUE;
        int maxAns=Integer.MIN_VALUE;
        for(int j=idx;j<Math.min(idx+k,arr.length);j++){
            len++;
            maxi=Math.max(maxi, arr[j]);
            int sum= len*maxi + solution(arr,k,j+1,dp);
            maxAns=Math.max(maxAns,sum);
        }
        return dp[idx]= maxAns;
    }
}
