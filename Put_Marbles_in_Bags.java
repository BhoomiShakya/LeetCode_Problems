class Solution {
    public long putMarbles(int[] arr, int k) {
         int []ans=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            ans[i-1]=arr[i]+arr[i-1];
        }
        Arrays.sort(ans);
        long max=0;
        long min=0;
        for(int i=0;i<k-1;i++){
            min+=ans[i];
            max+=ans[arr.length-i-2];
        }
        return max-min;
    }
}
