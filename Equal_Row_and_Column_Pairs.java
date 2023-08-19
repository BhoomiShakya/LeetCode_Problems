class Solution {
    public int equalPairs(int[][] arr) {
        int n=arr.length;
        int ans=0;
        Map<String, Integer> row= new HashMap<>();
        Map<String, Integer> col= new HashMap<>();
        for(int []r:arr){
            StringBuilder s= new StringBuilder();
            for(int val:r){
                s.append(val).append("_");
            }
            row.put(s.toString(), row.getOrDefault(s.toString(),0)+1);
        }
        for(int j=0;j<n;j++){
            StringBuilder s= new StringBuilder();
            for(int i=0;i<n;i++){
                s.append(arr[i][j]).append("_");
            }
            col.put(s.toString(), col.getOrDefault(s.toString(),0)+1);
        }
        for(Map.Entry<String, Integer> entry: row.entrySet()){
            String rhash=entry.getKey();
            if(col.containsKey(rhash)){
                ans+=col.get(rhash)* row.get(rhash);
            }
        }
        return ans;
    }
}
