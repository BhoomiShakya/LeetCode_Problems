class Solution {
    public int removeElement(int[] arr, int k) {
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=k){
                arr[idx]=arr[i];
                idx++;
            }
        }
        return idx;
    }
}
