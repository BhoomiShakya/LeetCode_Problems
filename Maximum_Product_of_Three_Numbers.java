class Solution {
    public int maximumProduct(int[] nums) {
        return solution(nums);
    }
    public static int solution(int []arr){
        Arrays.sort(arr);
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        ans=Math.max(arr[0]*arr[1]*arr[n-1],  arr[n-1]*arr[n-2]*arr[n-3]);
        return ans;
    }
}
