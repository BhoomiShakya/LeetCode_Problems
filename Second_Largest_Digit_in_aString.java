class Solution {
    public int secondHighest(String s) {
       return solution(s);
    }
    public static int solution(String s){
        HashSet <Integer> set = new HashSet<>();
        for(char c:s.toCharArray()){
            if(c>='0' && c<='9'){
                set.add(c-48);
            }
        }
        ArrayList <Integer> list= new ArrayList<>(set);
        Collections.sort(list);
        if(list.size()<=1){
            return -1;
        }
        return list.get((list.size()-2));
    }
}
