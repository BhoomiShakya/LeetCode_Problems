class Solution {
    public boolean checkString(String s) {
        String str=s;
        char []a=s.toCharArray();
        char []b=str.toCharArray();
        Arrays.sort(b);
        boolean ans=Arrays.equals(a, b);
        //System.out.println(ans);
        return ans;
    }
}
