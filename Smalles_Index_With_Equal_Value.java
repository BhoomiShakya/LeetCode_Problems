class Solution {
    public int smallestEqual(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if((i%10)==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
