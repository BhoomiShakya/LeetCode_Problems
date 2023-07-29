class Solution {
    public int[] searchRange(int[] nums, int target) {
        return solution(nums, target);
    }
   public static int[] solution(int[] arr, int t) {
        int start = findFirstOccurrence(arr, t);
        int end = findLastOccurrence(arr, t);

        return new int[]{start, end};
    }

    private static int findFirstOccurrence(int[] arr, int t) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == t) {
                result = mid;
                high = mid - 1; // Continue searching on the left side
            } else if (arr[mid] < t) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    private static int findLastOccurrence(int[] arr, int t) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == t) {
                result = mid;
                low = mid + 1; // Continue searching on the right side
            } else if (arr[mid] < t) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
