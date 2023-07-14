class Solution {
    public String truncateSentence(String s, int k) {
        return solution(s,k);
    }
    public static String solution(String s, int k){
        String arr[]= s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<k;i++){
            if(i<arr.length){
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
