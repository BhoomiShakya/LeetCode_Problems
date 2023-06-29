class Solution {
    public int findMin(int[] nums) {
        return solution(nums);
    }
    public static int solution(int []arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
           if(arr[low]<=arr[high]){
            return arr[low];
           }
           int mid=low+(high-low)/2;
           if(arr[low]>arr[mid]){
                high=mid;
           }
           else if(arr[mid]>arr[high]){
                low=mid+1;
            }
        }
        if(arr[low]<=arr[high]){
            return arr[low];
        }
        return -1;
    }
}
