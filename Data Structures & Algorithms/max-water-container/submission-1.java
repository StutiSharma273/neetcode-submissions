class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int left = 0;
        int right = heights.length - 1;

        while (right >= left) {
            max = Math.max(max, (right - left) * Math.min(heights[right], heights[left]));
            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }

        return max;
    }
}
