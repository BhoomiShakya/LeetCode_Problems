class Solution {
    public int unequalTriplets(int[] nums) {
        return solution(nums);
    }
     public static int solution(int []arr){
        int c=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if((arr[i] != arr[j]) && (arr[i] != arr[k]) && (arr[j] != arr[k])){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}
