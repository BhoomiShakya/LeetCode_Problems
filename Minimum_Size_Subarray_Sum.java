class Solution {
    public int minSubArrayLen(int t, int[] arr) {
        int i=0;
        int j=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(j<arr.length){
            sum+=arr[j];
            if(sum>=t){
                while(sum>=t){
                    min=Math.min(min,j-i+1);
                    sum-=arr[i];
                    i++;
                }
            }
            j++;
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return min;
        }
    }
}
