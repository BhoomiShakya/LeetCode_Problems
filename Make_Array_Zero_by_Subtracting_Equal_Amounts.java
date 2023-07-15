class Solution {
    public int minimumOperations(int[] nums) {
        return solution(nums);
    }
    public static int solution(int []arr){
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int x=arr[i];
                count++;
                for(int j=i;j<arr.length;j++){
                    arr[j]=arr[j]-x;
                }
            }
        }
        return count;
    }
}
