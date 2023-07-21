class Solution {
    public int triangularSum(int[] nums) {
       return solution(nums);
    }
    public static int solution(int []arr){
        int n=arr.length;
        if(n==1){
            return arr[0];
        }
        int []ans=new int [n-1];
        int j=0;
        for(int i=0;i<n-1;i++){
            if((arr[i]+arr[i+1])>=10){
                ans[j]=(arr[i]+arr[i+1])%10;
            }
            else{   
                ans[j]=(arr[i]+arr[i+1]);
            }       
            j++;
        }
        return solution(ans);
    }
}
