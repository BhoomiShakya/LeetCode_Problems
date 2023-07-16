class Solution {
    public int majorityElement(int[] nums) {
        return solution(nums);
    }   
      public static int solution(int []arr){
        Arrays.sort(arr);
        int n=arr.length;
        return arr[n/2];
    }
}
