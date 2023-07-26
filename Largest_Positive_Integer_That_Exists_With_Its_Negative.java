class Solution {
    public int findMaxK(int[] nums) {
        return solution(nums);
    }
    public static int solution(int []arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>0;j--){
                if(arr[i]+arr[j]==0){
                    return arr[j];
                }
            }
        }
        return -1;
    }
}
