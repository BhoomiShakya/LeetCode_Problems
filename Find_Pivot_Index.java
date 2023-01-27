class Solution {
    public int pivotIndex(int[] arr) {
        int n=arr.length;
        int left_s=0;
        int right_s=0;
        for(int s:arr){
            right_s+=s;
        }
        for(int i=0;i<n;i++){
            right_s-=arr[i];
            if(right_s==left_s){
               return i;
            }
            left_s+=arr[i];
        }
        return -1;
    }
}
