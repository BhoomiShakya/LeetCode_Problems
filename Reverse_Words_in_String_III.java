class Solution {
    public String reverseWords(String s) {
        return solution(s);
    }
    public static String solution(String s) {
        String[] arr = s.split("\\s");
        ArrayList<String> list = new ArrayList<>();
        for (String word : arr) {
            char[] chars = word.toCharArray();
            reverse(chars);
            list.add(new String(chars));
        }
        return String.join(" ", list);
    }

    public static void reverse(char[] word) {
        int i = 0;
        int j = word.length - 1;
        while (i <= j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
    }
}
