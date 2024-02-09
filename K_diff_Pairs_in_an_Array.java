class Solution {
    public int findPairs(int[] arr, int k) {
        Arrays.sort(arr);
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1; j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j])==k){
                    cnt++;
                    break;
                }
                else if(Math.abs(arr[i]-arr[j])>k){
                    break;
                }
            }
        }              
        return cnt;
    }
}
