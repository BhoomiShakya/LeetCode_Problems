class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<Integer> list= new ArrayList<>();
        List<List<Integer>>list2= new ArrayList<>();
        output(arr, list, 0,list2);
        return list2;
    }
     public static void output(int []arr, List<Integer> list, int idx,List<List<Integer>>list2){
        if(idx==arr.length){
            list2.add(new ArrayList<>(list));
            return;
        }
        output(arr, list, idx+1,list2);
        list.add(arr[idx]);
        output(arr, list, idx+1, list2);
        list.remove(list.size()-1);
    }
}
