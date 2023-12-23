class Solution {
    public boolean isPathCrossing(String path) {
        return solution(path);
    }
    public static boolean solution(String s){
        int x=0;
        int y=0;
        Set<String> mp= new HashSet<>();
        mp.add("0,0");
        for(char val: s.toCharArray()){
            if(val=='E'){
                x++;
            }
            if(val=='W'){
                x--;
            }
            if(val=='N'){
                y++;
            }
            if(val=='S'){
                y--;
            }
            String pos=(x+","+y);
            if(mp.contains(pos)){
                return true;
            }
            mp.add(pos);
        }
        return false;
    }
}
