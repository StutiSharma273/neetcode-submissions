class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (right > left) {
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                int[] ans = new int[2];
                ans[0] = left + 1;
                ans[1] = right + 1;
                return ans;
            }
        }

        return new int[2];
    }
}
