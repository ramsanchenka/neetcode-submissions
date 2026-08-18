class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        return bfs(grid);
    }
        public int bfs (int[][] grid){
        int ROWS = grid.length;
        int COLS = grid[0].length;
        if (grid[0][0] == 1 || grid[ROWS - 1][COLS - 1] == 1) return -1;
        int[][] visit = new int[ROWS][COLS];
        Deque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[2]);
        visit[0][0] = 1;
        int length = 1;
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                int[] row = queue.poll();
                int rowIndex = row[0];
                int colIndex = row[1];
                if (rowIndex == ROWS - 1 && colIndex == COLS - 1) {
                    return length;
                }                int [][] neighbors = {
                        {rowIndex, colIndex+1},
                        {rowIndex, colIndex-1},
                        {rowIndex+1, colIndex},
                        {rowIndex-1, colIndex},
                        {rowIndex+1, colIndex+1},
                        {rowIndex-1, colIndex-1},
                        {rowIndex+1, colIndex-1},
                        {rowIndex-1, colIndex+1}
                };
                for (int j = 0; j < neighbors.length; j++) {
                    int newRowIndex = neighbors[j][0], newColIndex = neighbors[j][1];
                    if(Math.min(newRowIndex, newColIndex) < 0|| newRowIndex == ROWS||newColIndex == COLS ||
                            visit[newRowIndex][newColIndex] == 1 || grid[newRowIndex][newColIndex] == 1){
                        continue;
                    }
                    queue.add(neighbors[j]);
                    visit[newRowIndex][newColIndex] = 1;
                }
            }
            length++;
        }
        return -1;
    }
}