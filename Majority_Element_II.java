class Solution {
    public List<Integer> majorityElement(int[] nums) {
        return solution(nums);
    }
    public static List<Integer> solution(int []arr){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i], 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int n=arr.length;
        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            if(entry.getValue() >n/3){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
