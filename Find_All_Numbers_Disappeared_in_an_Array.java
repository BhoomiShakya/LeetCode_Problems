class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
         Set <Integer> set = new HashSet<>();
         for(int x:arr){
             set.add(x);
         }
         ArrayList<Integer> list= new ArrayList<>();
         for(int i=1;i<=arr.length;i++){
             if(!set.contains(i)){
                 list.add(i);
             }
         }
         return list;
    }
}
