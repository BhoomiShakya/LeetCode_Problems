class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        return solution(arr);
    }
    public static int solution(int []arr){
        Arrays.sort(arr);
        arr[0]=1;
        for(int i=1;i<arr.length; ++i){
            if(Math.abs(arr[i] - arr[i - 1]) <= 1){
                continue;
            }
            else{
                arr[i]=arr[i-1]+1;
            }
        }
        return arr[arr.length-1];
    } 
}
