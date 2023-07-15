class Solution {
    public int countKDifference(int[] nums, int k) {
        return solution(nums,k);
    }
    public static int solution(int []arr, int k){
        int c=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if (Math.abs(arr[i] - arr[j]) == k) {
                    c++;
                }
            }
        }
        return c;
    }
}
