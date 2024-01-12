class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int []ans= new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stk.isEmpty() && arr[i]>=arr[stk.peek()]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                ans[i]=stk.peek()-i;
            }
            stk.push(i);
        }
        return ans;
    }
}
