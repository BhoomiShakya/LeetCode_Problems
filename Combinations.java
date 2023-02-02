class Solution {
    public List<List<Integer>> combine(int n, int k) {
         List<Integer> list= new ArrayList<>();
       List<List<Integer>> list2= new ArrayList<>();
        boolean []arr= new boolean[n+1];
       check(arr, k, 0,list,1,list2);
       return list2;
    }
    public static void check(boolean []arr, int k, int ans_f, List<Integer>list , int m, List<List<Integer>> list2){
        if(k==ans_f){
          //  System.out.print(list);
            list2.add(new ArrayList<>(list));
            return;
        }
        for(int i=m;i<arr.length;i++){
            if(arr[i]==false){
                arr[i]=true;
                list.add(i);
                check(arr, k, ans_f+1, list, i, list2);
                list.remove(list.size()-1);
                arr[i]=false;
            }
        }
    }
}
