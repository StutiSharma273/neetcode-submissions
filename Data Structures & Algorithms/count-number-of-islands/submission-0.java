class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int col = grid[0].length;
        int count = 0;
        int[][] vis = new int[rows][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (vis[i][j] != 1 && grid[i][j] == '1') {
                    count += 1;
                    dfs(i, j, rows, col, grid, vis);
                }
            }
        }

        return count;
    }

    private void dfs(int i, int j, int rows, int col, char[][] grid, int[][] vis) {
        if (i >= 0 && i < rows && j >= 0 && j < col && vis[i][j] != 1 && grid[i][j] == '1') {
            vis[i][j] = 1;
            dfs(i + 1, j, rows, col, grid, vis);
            dfs(i - 1, j, rows, col, grid, vis);
            dfs(i, j + 1, rows, col, grid, vis);
            dfs(i, j - 1, rows, col, grid, vis);
        }

        return;
    }
}
