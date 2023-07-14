class Solution {
    public boolean validateStackSequences(int[]arr1, int[]arr2) {
        Stack <Integer> stk = new Stack<>();
        int i=0;
        int j=0;
        while(i<arr1.length){
            stk.push(arr1[i]);
            while(!stk.isEmpty() && j<arr2.length && stk.peek()==arr2[j]){
                stk.pop();
                j++;
            }
            i++;
        }
        return stk.isEmpty();
    }
}
