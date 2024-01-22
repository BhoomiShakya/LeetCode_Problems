class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        return solution(ransomNote, magazine);
    }
    public static boolean solution(String r, String m){
        char []arr1= r.toCharArray();
        char []arr2= m.toCharArray(); 
        HashMap<Character, Integer> mp= new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            if(mp.containsKey(arr2[i])){
                mp.put(arr2[i], mp.get(arr2[i])+1);
            }
            else{
                mp.put(arr2[i], 1);
            }
        }
         for(int i=0;i<arr1.length;i++){
            if(mp.containsKey(arr1[i]) && mp.get(arr1[i])> 0){
                mp.put(arr1[i], mp.get(arr1[i])-1);
            }
            else{ return false;}
        }
        return true;
    }
}
