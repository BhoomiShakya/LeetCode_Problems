class Solution {
    public void sortColors(int[] arr) {
           solution(arr); 
    }
    public static int [] solution(int []arr){
       int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int t=arr[low];
                arr[low]=arr[mid];
                arr[mid]=t;
                low++;
                mid++;
            }
            else if(arr[mid]==2){
                int t=arr[mid];
                arr[mid]=arr[high];
                arr[high]=t;
                high--;
            }
            else{
                mid++;
            }
        }
        return arr;
    }
}
