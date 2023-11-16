class Solution {
    public int compress(char[] chars) {
        return solution(chars); 
    }
    public static int solution(char[]arr){
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int i = 0; 
        int curr = 0;
        while (i < arr.length) {
            int cnt = 0;
            char curr_char = arr[i];
            while (i < arr.length && arr[i] == curr_char) {
                i++;
                cnt++;
            }
            arr[curr++] = curr_char;
            if (cnt > 1) {
                String cntString = String.valueOf(cnt);
                for (char c : cntString.toCharArray()) {
                    arr[curr++] = c;
                }
            }
        }
        return curr; 
    }
}
