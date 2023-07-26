class Solution {
    public int distinctAverages(int[] nums) {
        return solution(nums);
    }
     public static int solution(int []arr){
        Arrays.sort(arr);
        Set<Double> avg= new HashSet<>();
        for(int i=0;i<arr.length/2;i++){
            avg.add((arr[i]+arr[arr.length-i-1])/2.0);    
        }
        return avg.size();
    }
}
