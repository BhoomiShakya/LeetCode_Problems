class Solution {
    public int maximumCount(int[] nums) {
        return solution(nums);
    }
    public static int solution(int []arr){
        int pos=0;
        int neg=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos++;
            }
            else if(arr[i]<0){
                neg++;
            }
        }
        int ans=Math.max(pos,neg);
        return ans;
    }
}
