class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
         ArrayList <Integer> list= new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=0;
        while(i<arr1.length && j< arr2.length){
            if((arr1[i]==arr2[j])){
                if(list.isEmpty() || list.get(list.size()-1)!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        } 
        int []ans=new int[list.size()];
        int k=0;
        for(int val:list){  
            ans[k]=val;
            k++;
        }
        return ans;
    }
}
