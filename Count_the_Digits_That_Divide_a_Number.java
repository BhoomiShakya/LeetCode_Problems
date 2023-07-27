class Solution {
    public int countDigits(int num) {
      return solution(num);  
    }
    public static int solution(int n){
        int c=0;
        int []ans=element(n);
        for(int i=0;i<ans.length;i++){
            if(n%ans[i]==0){
                c++;
            }
        }
        return c;
    }
    public static int[] element(int n){
        ArrayList <Integer> list= new ArrayList<>();
        while(n>0){
            int rem=n%10;
            list.add(rem);
            n=n/10;
        }
        int []ans=new int[list.size()];
        int i=0;
        for(int val:list){
            ans[i]=val;
            i++;
        }
        return ans;
    }
}
