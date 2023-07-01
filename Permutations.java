class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<Integer> list= new ArrayList<>();
       List<List<Integer>> list2= new ArrayList<>();
       soltuion(arr, list, list2);
       return list2;
    }
    public static void soltuion(int []arr, List<Integer> list,List<List<Integer>> list2 ){
        if(list.size()==arr.length){
             list2.add(new ArrayList<>(list));
            return;
        }else{
            for(int i=0;i<arr.length;i++){
                if(list.contains(arr[i])){
                    continue;
                }
            list.add(arr[i]);
            soltuion(arr, list, list2);
            list.remove(list.size()-1);
            }
        }
    }
}
