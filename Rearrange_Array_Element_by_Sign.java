class Solution {
    public int[] rearrangeArray(int[] arr) {
        ArrayList <Integer> posi= new ArrayList<>();
        ArrayList <Integer> neg= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                neg.add(arr[i]);
            }
            else{
                posi.add(arr[i]);
            }
        }
        int []ans=new int[arr.length];
        int j=0;
        int k=0;
        for(int i=0;i<ans.length;i++){
            if(i%2==0){
                ans[i]=posi.get(j);
                j++;
            }
            else{
                ans[i]=neg.get(k);
                k++;
            }
        }
        return ans;
    }
}
