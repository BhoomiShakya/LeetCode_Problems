class Solution {
    public int[] replaceElements(int[] arr) {
        int []ans=new int[arr.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<arr.length-1;i++){
            ans[i]=maxi(arr,i+1);
        }


        return ans;
    }
    public static int maxi(int []arr,int idx){
        int max=arr[idx];
        for(int i=idx+1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
