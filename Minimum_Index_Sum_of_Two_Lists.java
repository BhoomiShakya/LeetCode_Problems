class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
 HashMap<String , Integer> mp= new HashMap<>();
        for(int i=0;i<list1.length;i++){
            mp.put(list1[i], i);
        }
        int mini=Integer.MAX_VALUE;

        ArrayList<String> str= new ArrayList<>();
        for(int i=0;i<list2.length;i++){
            if(mp.containsKey(list2[i])){
               int sum=i+mp.get(list2[i]);
               if(sum<mini){
                mini=sum;
                str.clear();
                str.add(list2[i]);
               }
               else if(mini==sum){
                str.add(list2[i]);
               }
            }
        }
        return str.toArray(new String[0]);
    }
}
