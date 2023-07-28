class Solution {
    public int distinctPrimeFactors(int[] nums) {
        return solution(nums);
    }
    public static int solution(int []nums){
         Set<Integer> primeFactors = new HashSet<>();
        for (int num : nums) {
            // Factorize num into its prime factors
            int i = 2;
            while (num > 1) {
                if (num % i == 0) {
                    primeFactors.add(i);
                    num /= i;
                } else {
                    i++;
                }
            }
        }
        return primeFactors.size();
    }
}
