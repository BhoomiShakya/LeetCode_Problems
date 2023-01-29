class Solution {
    public int singleNumber(int[] nums) {
        boolean flag;
        int i, j;
        int ans = 0;
        for (i = 0; i < nums.length; i++) {
            flag = false;
            for (j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                ans = nums[i];
                break;
            }
        }
        return ans;  
        
    }
}
