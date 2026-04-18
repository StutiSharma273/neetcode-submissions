class Solution {
    public int climbStairs(int n) {
        int oneStep = 1;
        int twoStep = 1;
        int ways = 0;

        for (int i = 0; i < n - 1; i++) {
            ways = oneStep + twoStep;
            twoStep = oneStep;
            oneStep = ways;
        }

        return ways == 0 ? 1 : ways;
    }
}
