class Solution {
    public String largestGoodInteger(String s) {
        return solution(s);
    }
    public static String solution(String s){
        int max=-1;
        for(int i=0;i<s.length()-2;i++){
            if((s.charAt(i)==s.charAt(i+1))&&(s.charAt(i+1)==s.charAt(i+2))){
                String str=s.substring(i, i+3);
                max=Math.max(max,Integer.parseInt(str));
            }
        }
        if(max==0){
            return "000";
        }
        if(max==-1){
            return "";
        }
        return Integer.toString(max);
    }
}
