class Solution {
    public int countDistinctIntegers(int[] nums) {
        return solution(nums);
    }
     public static int solution(int []arr){
        int []ans= new int[arr.length*2];
        ArrayList<Integer> list = new ArrayList<>();        
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            int rev=reverse(arr[i]);
            ans[i]=rev;
            list.add(ans[i]);
        }
        int res= digits(list);
        return res;
    }
    public static int digits(ArrayList<Integer> list){
        HashSet<Integer> hset = new HashSet<Integer>(list);
        return (hset.size());
    }

    public static int reverse(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        return sum;
    }
}
