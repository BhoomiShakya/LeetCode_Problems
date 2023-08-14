class Solution {
    public List<Boolean> kidsWithCandies(int[]arr, int t) {
         int max=-1;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        ArrayList<Boolean> list = new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            list.add(arr[j]+t>=max);
        }
        return list;
    }
}

