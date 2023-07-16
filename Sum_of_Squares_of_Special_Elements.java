class Solution {
    public int sumOfSquares(int[] nums) {
         int n = nums.length;
        int specialSum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                specialSum += nums[i - 1] * nums[i - 1];
            }
        }

        return specialSum;
    }
}
