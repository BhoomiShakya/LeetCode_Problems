import java.math.BigInteger;
class Solution {
    public String addStrings(String s1, String s2) {
        BigInteger i=new BigInteger(s1);
        BigInteger j= new BigInteger(s2);
        BigInteger ans=i.add(j);
        String res=ans.toString();
        return res;

    }
}
