class Solution {
    public int bitwiseComplement(int n) {
         String s=Integer.toBinaryString(n);
        //System.out.println(s);
        String ans="";
        for(char ch :s.toCharArray()){
            if(ch=='1'){
                ans+="0";
            }
            else{
                ans+="1";
            }
        }
        return Integer.parseInt(ans,2);
    }
}
