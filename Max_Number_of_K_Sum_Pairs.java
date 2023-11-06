class Solution {
    public int maxOperations(int[] nums, int k) {
        return solution(nums, k);
    }
    public static int solution(int []arr, int k){
        Arrays.sort(arr);
        int i=0;
        int sum=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==k){
                sum++;
                i++;
                j--;
            }
            else if(arr[i]+arr[j]<k){
                i++;
            }
            else{
                j--;
            }
            
        } 
        return sum;
    }
}
