class Solution {
    public int[] sortByBits(int[] arr) {
        return solution(arr);
    }
    public static int[] solution(int []arr){
        Integer[] anss = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            anss[i] = arr[i];
        }

        Arrays.sort(anss, (a, b) -> {
            int bitCountA = Integer.bitCount(a);
            int bitCountB = Integer.bitCount(b);

            if (bitCountA != bitCountB) {
                return bitCountA - bitCountB;
            } else {
                return a - b;
            }
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = anss[i];
        }

        return arr;
    }
}
