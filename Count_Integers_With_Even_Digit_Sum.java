class Solution {
    public int countEven(int num) {
         int c=0;
        for(int i=1;i<=num;i++){
            int j=sum(i);
            if(j%2==0){
                c++;
            }
        }
        return c;
    }
    public static int sum(int i){
        int sum=0;
        while(i>0){
            sum=sum+i%10;
            i=i/10;
        }
        return sum;
    }
}
