class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        return solution(nums,pivot);
    }
    public static int[] solution(int []arr, int k){
        ArrayList <Integer> prev = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<k){
                prev.add(arr[i]);
            }
        }
        ArrayList <Integer> end = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>k){
                end.add(arr[i]);
            }
        }
        ArrayList <Integer> mid = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                mid.add(arr[i]);
            }
        }

       int ans[]= new int[arr.length];
       int idx=0;
       for(int val:prev){
            ans[idx]=val;
            idx++;
       }
       for(int val:mid){
        ans[idx]=val;
        idx++;
       }
       for(int val:end){
        ans[idx]=val;
        idx++;
       }
       return ans;
    }
}
