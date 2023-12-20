class Solution {
    public int buyChoco(int[] prices, int money) {
       return solution(prices, money); 
    }
    public static int solution(int []arr, int  m){
        Arrays.sort(arr);
        int t=2;
        if(arr[0]+arr[1]<=m){
            return m-(arr[0]+arr[1]);
        }
        // if(arr[0]+arr[1]>m){
        //     return m;
        // }
        return m;
    }
}
