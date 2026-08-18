class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for(int row =0;row<grid.length;row++){
            for(int col = 0; col<grid[row].length; col++){
                if(grid[row][col]==1){
                    int count = dfs(grid, row,col);
                    res = Math.max(res,count);
                }
            }
        }
        return res;
        
    }
    int dfs(int[][] grid, int row, int col){
        if(row<0 || col < 0 || row >= grid.length ||col>=grid[row].length || grid[row][col]==0){
            return 0;
        }

        grid[row][col] = 0;
        int count = 1;
        count +=dfs(grid, row + 1,col);
        count +=dfs(grid, row ,col+1);
        count +=dfs(grid, row - 1,col);
        count +=dfs(grid, row,col-1);
        return count;
    }
}
