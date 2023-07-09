class Solution {
    public int[] countBits(int n) {
        return solution(n);
    }
      public static int[] solution(int n) {
        int[] result = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            result[i] = countOnes(i);
        }

        return result;
    }

    public static int countOnes(int num) {
        int count = 0;

        while (num > 0) {
            if (num % 2 == 1) {
                count++;
            }
            num = num / 2;
        }

        return count;
    }
}
