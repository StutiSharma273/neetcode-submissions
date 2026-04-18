class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                leftMax[i] = Math.max(leftMax[i - 1], height[i]);
            } else {
                leftMax[i] = height[0];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1) {
                rightMax[i] = Math.max(rightMax[i + 1], height[i]);
            } else {
                rightMax[i] = height[n - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            int water = Math.min(leftMax[i], rightMax[i]) - height[i];
            sum += water;
        }

        return sum;
    }
}
