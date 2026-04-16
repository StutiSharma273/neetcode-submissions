class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (i - 1 < 0) {
                leftProduct[i] = 1;
            } else {
                leftProduct[i] = nums[i - 1] * leftProduct[i - 1];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i + 1 == n) {
                rightProduct[i] = 1;
            } else {
                rightProduct[i] = nums[i + 1] * rightProduct[i + 1];
            }
        }

        for (int i = 0; i < n; i++) {
            ans[i] = leftProduct[i] * rightProduct[i];
        }

        return ans;
    }
}
