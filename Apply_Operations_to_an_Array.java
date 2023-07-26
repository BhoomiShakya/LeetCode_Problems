class Solution {
    public int[] applyOperations(int[] nums) {
        return solution(nums); 
    }
     public static int[] solution(int []arr){
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1){
                if(arr[i]==arr[i+1]){
                    arr[i]=2*arr[i];
                    arr[i+1]=0;
                }
            }
        }
        ArrayList <Integer> list = new ArrayList<>();
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                cnt++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }
        for(int i=0;i<cnt;i++){
            list.add(0);
        }
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
