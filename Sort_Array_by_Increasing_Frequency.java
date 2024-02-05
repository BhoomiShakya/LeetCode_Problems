class Solution {
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
        ArrayList<Integer> list = new ArrayList<>(mp.keySet());
        Collections.sort(list,(a,b)->{
            return (mp.get(a)==mp.get(b))?b-a: mp.get(a)-mp.get(b);
        });
        int []ans= new int[arr.length];
        int idx=0;
        for(int val:list){
            for(int i=0;i<mp.get(val);i++){
                ans[idx++]=val;
            }
        }
        return ans;
        
    }
}
