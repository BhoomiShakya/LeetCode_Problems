class Solution {
    class Pair{
        int k;
        int val;
        Pair(int k , int val){
            this.k= k;
            this.val=val;
        }
    }
    public int[] frequencySort(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],1);
            }
        }
        ArrayList<Pair> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            list.add(new Pair(entry.getKey(), entry.getValue()));
        }        
        Collections.sort(list, (a,b)-> a.val==b.val? b.k-a.k:a.val-b.val);
        int []ans= new int[arr.length];
        int idx=0;
       for (Pair pair : list) {
            int x = pair.k;
            int freq = pair.val;
            for (int i = 0; i < freq; i++) {
                ans[idx++] = x;
            }
        }
        return ans;
        
    }
}
