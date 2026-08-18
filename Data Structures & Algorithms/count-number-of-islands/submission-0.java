class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0;j<grid[i].length;j++){
                        if(grid[i][j] =='1'){
            areaDfs(grid, i, j);
                        res++;

        } 
            }
        }
       
        
        return res;
    }

    void areaDfs(char[][] grid , int row, int col){
        if(row<0|| col< 0 || row>= grid.length||col >= grid[row].length || grid[row][col]=='0'){
            return;
        }
        grid[row][col] = '0';
        areaDfs(grid, row + 1, col);
        areaDfs(grid, row, col +1 );
        areaDfs(grid, row - 1, col);
        areaDfs(grid, row, col - 1 );
    }
}
