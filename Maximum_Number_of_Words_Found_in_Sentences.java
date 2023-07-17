class Solution {
    public int mostWordsFound(String[] sentences) {
        return solution(sentences);
    }
    public static int solution(String []arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            int length=check_len(s);
            max=Math.max(max, length);
        }
        return max;
    } 
    public static int check_len(String s){
        String []arr=s.split("\\s");
        return arr.length;
    }
}
