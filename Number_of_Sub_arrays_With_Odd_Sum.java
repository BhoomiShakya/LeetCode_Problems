class Solution {
    public int numOfSubarrays(int[] arr) {
        int c=0;
        int sum=0;
        int odd=0;
        int even=1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum%2==0){
                c=(c+odd)%1000000007;
                even++;
            }
            else{
                c=(c+even)%1000000007;
                odd++;
            }
        }
        return c;
    }
}
