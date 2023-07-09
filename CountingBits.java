class Solution {
    public int[] countBits(int n) {
        return solution(n);
    }
    public static int[] solution(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<=n;i++){
            int num=i;
            int sum=0;
            while(num>0){
                int rem=num%2;
                sum=sum*10+rem;
                num=num/2;
            }
            String binary = Integer.toBinaryString(i);
            list.add(sum);
        }
        // System.out.println(list);
        int []ans=count_1(list);
        // for(int i=0;i<ans.length;i++){
        //     System.out.print(ans[i]+" ");
        // }
        return ans;
        
    }
    public static int [] count_1(ArrayList<Integer> list){
        int []ans=new int[list.size()];
        int i=0;
        for(int val:list){
            int c=0;
            while(val>0){
                int rem=val%10;
                if(rem==1){
                    c++;
                    ans[i]=c;
                }
                else{

                }
                val=val/10;
            }
            i++;
        }
        return ans;
    }
}
