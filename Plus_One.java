class Solution {
    public int[] plusOne(int[]arr) {
        arr[arr.length-1]+=1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==10 && i!=0){
                arr[i]=0;
                arr[i-1]+=1;
            }
            if(arr[i]==10){
                int []ans=new int[arr.length+1];
                ans[i]=1;
                return ans;
            }
        }
        return arr;
    }
}
