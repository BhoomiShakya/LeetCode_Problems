class Solution {
    public int minPairSum(int[] nums) {
        return solution(nums);
    }
     public static int solution(int []arr){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int mini=Integer.MIN_VALUE;
        while(i<j){
            int curr=arr[i]+arr[j];
            mini=Math.max(mini, curr);
            i++;
            j--;
        }
        return mini;
    }
}
