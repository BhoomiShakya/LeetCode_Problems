class Solution {
    public int singleNumber(int[] arr){
        Arrays.sort(arr);
            if(arr.length==1 || arr[0]!=arr[1]){
                return arr[0];
            }
            int j=1;
            for(int i=0;i<arr.length-2;i++){
                if(arr[i]!=arr[j]){
                    if(arr[j]!=arr[j+1]){
                        return arr[j];
                    }
                }
                j++;
            }
            return arr[j];
    }
}
