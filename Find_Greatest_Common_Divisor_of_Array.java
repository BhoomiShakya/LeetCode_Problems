class Solution {
    public int findGCD(int[] nums) {
        return solution(nums);
    }
    public static int solution(int []arr){
        Arrays.sort(arr);
        int max=arr[0];
        int min=arr[arr.length-1];
        int ans=gcd(min, max);
        return ans;
    }
    public static int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
