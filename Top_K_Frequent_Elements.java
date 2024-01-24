class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        return solution(nums, k);
    }
    public static int[]solution(int []arr, int k){
        HashMap<Integer, Integer> mp= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i], 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(mp.values());
        Collections.sort(list, Collections.reverseOrder());
        ArrayList<Integer> list2 = new ArrayList<>(list.subList(0,k));
        int []ans= new int[list2.size()];
        int idx=0;
        for(var entry: mp.entrySet()){
            if(list2.contains(entry.getValue())){
                ans[idx++]=entry.getKey();
            }
        }
        return ans;
    }
}
