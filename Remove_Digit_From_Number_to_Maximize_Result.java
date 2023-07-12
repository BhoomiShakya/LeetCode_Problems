class Solution {
    public String removeDigit(String number, char digit) {
        return solution(number,digit);
    }
    public static String solution(String s, char d){
        ArrayList <String> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==d){
                String new_string=s.substring(0,i)+s.substring(i+1);
                list.add(new_string);
            }
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}
