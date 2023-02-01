class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int t) {
         List<List<Integer>> list2= new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        combination(arr, t, list,0, list2);
        return list2;
    }
    public static void combination(int []arr, int t ,List<Integer> list, int k, List<List<Integer>>list2){
        if(t==0){
            // System.out.print(list);
            list2.add(new ArrayList<>(list));
            return;
        }
        for(int i=k;i<arr.length;i++){
            if(t>=arr[i]){
                list.add(arr[i]);
                combination(arr, t-arr[i],list,i,list2);
                list.remove(list.size()-1);
            }
        }
    }
}
