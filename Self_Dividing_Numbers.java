class Solution {
    public List<Integer> selfDividingNumbers(int l, int r) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=l;i<=r;i++){
            if(check(i)){
                list.add(i);
            }
        }
        
        return list;
    }
    public static boolean check(int n){
        int temp=n;
        while(n>0){
            int rem=n%10;
            if (rem== 0 || temp % rem != 0) {
                return false;
            }
            n=n/10;
        }
        return true;
    }
}
