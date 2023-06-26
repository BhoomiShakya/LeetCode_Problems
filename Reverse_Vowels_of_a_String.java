class Solution {
    public String reverseVowels(String s) {
        char []arr= s.toCharArray();
        List<Character> list= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I'|| arr[i]=='O' || arr[i]=='U'){
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
       int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i])=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I'|| arr[i]=='O' || arr[i]=='U') {
                arr[i] =list.get(j);
                j++;
            }
        }
        return new String(arr);
    }
}
