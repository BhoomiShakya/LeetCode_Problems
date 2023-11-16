class Solution {
    public String findDifferentBinaryString(String[] nums) {
        return solution(nums);
    }
    public static String solution(String []arr){
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<arr.length;i++){
            char curr=arr[i].charAt(i);
            if(curr=='0'){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        return new String(sb);
    }
}
