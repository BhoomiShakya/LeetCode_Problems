class Solution {
    public int[] twoSum(int[] numbers, int target) {
        return solution(numbers, target);
    }
    public static int[] solution(int []arr, int t){
        int []ans= new int[2];
       int str=0;
       int end=arr.length-1;
       while(str<=end){
           if(arr[str]+arr[end]<t){
               str=str+1;
           }
           else if(arr[str]+arr[end]>t){
               end=end-1;
           }
           else{
               ans[0]=str+1;
               ans[1]=end+1;
               return ans;
           }
       }
       return ans;
    }
}
