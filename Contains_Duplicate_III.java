class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        return solution(nums, indexDiff, valueDiff);
    }
    public static boolean solution(int []arr, int idx_diff, int val_diff){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=i+idx_diff;j++){
                if(j<arr.length){
                    if(i!=j){
                        if(Math.abs(i-j)<=idx_diff && Math.abs(arr[i]-arr[j])<=val_diff){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
