class Solution {
    public int firstMissingPositive(int[] arr) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0; i<arr.length;i++){
            set.add(arr[i]);
        }
        int i=1;
        while(i<=arr.length){
            if(set.contains(i)){
                i++;
            }
            else{
                return i;
            }
        }
        return arr.length+1;

    }
}
