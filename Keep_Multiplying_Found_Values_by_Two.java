class Solution {
    public int findFinalValue(int[] arr, int k) {
        return solution(arr,k);   
    }
    public static int solution(int []arr, int k){
        Arrays.sort(arr);
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        boolean check=true;
        while(check==true){
            if(set.contains(k)){
                check=true;
                k=2*k;
                continue;
            }
            else {
                break;
            }
        }
        return k;
    }
}
