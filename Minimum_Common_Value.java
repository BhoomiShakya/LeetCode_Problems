class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        return solution(nums1, nums2);
    }
    public static int solution(int []arr1, int []arr2){
         int p1=0;
       int p2=0;
       while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1]==arr2[p2]){
                return arr1[p1];
            }
            else if(arr1[p1]<arr2[p2]){
                p1++;
            }
            else{
                p2++;
            }
        }
        return -1;
    }
}
