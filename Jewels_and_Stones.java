class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        return solution(jewels, stones);
    }
    public static int solution(String jew , String stone){
        ArrayList <Character> list= new ArrayList<>();
        char[]arr1=jew.toCharArray();
        char[]arr2=stone.toCharArray();
        for(int i=0;i<arr1.length;i++){
            list.add(arr1[i]);
        }
        int cnt=0;
        for(int i=0;i<arr2.length;i++){
            if(list.contains(arr2[i])){
                cnt++;
            }
        }
        return cnt;
    }
}
