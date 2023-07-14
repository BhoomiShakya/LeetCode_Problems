class Solution {
    public int getMinDistance(int[] arr, int t, int s) {
        int min_dis=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                int dis=Math.abs(i-s);
                if(dis<min_dis){
                    min_dis=dis;
                    ans=dis;
                }
            }
        }
        return ans;
    }
}
