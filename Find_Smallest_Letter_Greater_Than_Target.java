class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return solution(letters,target);    
    }    
    public static char solution(char[]arr, char tar){
        int l=0;
        int h=arr.length-1;
        if(tar>=arr[h]){
            return arr[0];
        }
        char ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>tar){
                ans=arr[mid];
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}
