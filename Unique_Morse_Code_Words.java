class Solution {
    static String []arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        return solution(words);
    }
    public static int solution(String []arr){
        ArrayList <String> list= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            char []ar1=arr[i].toCharArray();
            String ans=changing(ar1);
            if(!list.contains(ans)){
                list.add(ans);
            }
        }
        return list.size();
    }
    public static String changing(char []ar1){
        StringBuilder ans = new StringBuilder();
        for (char ch : ar1) {
            int index = ch - 'a';
            ans.append(arr[index]);
        }
        return ans.toString();
    }
}
