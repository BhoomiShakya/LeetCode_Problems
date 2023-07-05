class Solution {
    public int longestSubarray(int[] arr) {
        int i=0;
        int j=0;
        int max=0;
        int cnt0=0;
        while(j<arr.length){
            if(arr[j]==0){
                cnt0++;
            }
            while(i<arr.length && cnt0==2){
                if(arr[i]==0){
                    cnt0--;
                }
                i++;
            }
            max=Math.max(j-i,max);
            j++;
        }
        return max;
    }
}
