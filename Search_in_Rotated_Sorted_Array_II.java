class Solution {
    public boolean search(int[] arr, int k) {
         int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==k){
                return true;
            }
            if(arr[low]<arr[mid]){
                if(arr[low]<=k && arr[mid]>k){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
                
            }
            else if(arr[low]>arr[mid]){
                if(arr[mid]<k && k<= arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
               // return true;
            }
            else{
                low++;
            }
        }
        return false;
    }
}
