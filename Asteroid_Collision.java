class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stk.isEmpty() || arr[i]>0){
                stk.push(arr[i]);//positive element hai n blindly push ho gya
            }
            else{
                while(!stk.isEmpty()){
                    int top=stk.peek();
                    if(top<0){
                        stk.push(arr[i]);
                        break;
                    }
                    int val=Math.abs(arr[i]);
                    if(val==top){
                        stk.pop();
                        break;
                    }
                    else if(val<top){
                        break;
                    }
                    else{
                        stk.pop();
                        if(stk.isEmpty()){
                            stk.push(arr[i]);
                            break;
                        }
                    }
                }
            }
        }
        int l=stk.size();
        int []ans= new int[l];
        for(int i=l-1;i>=0;i--){
            ans[i]=stk.pop();

        }
        return ans;
    }
}
