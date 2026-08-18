class Solution {
    public int orangesRotting(int[][] grid) {
                int rows = grid.length;
        int cols = grid[0].length;
        Deque<int[]> queue = new ArrayDeque<>();
        int time =0;
        int fresh = 0;
        for(int row =0; row<grid.length;row++){
            for(int col = 0; col< grid[row].length;col++){
                if(grid[row][col]==1){
                    fresh++;
                }
                if(grid[row][col]==2){
                    queue.add(new int[]{row,col});
                }
            }
        }
        int [][] directions = {
            {-1,0},{0,-1},{1,0},{0,1}
        };

        while(!queue.isEmpty()&& fresh >0){
            int size = queue.size();
            for(int i = 0; i<size;i++){
                int[]current = queue.poll();
                int currentRow = current[0], currentCol = current[1];
                for(int[] direction: directions){
                    int newRow = currentRow + direction[0];
                    int newCol = currentCol + direction [1];
                    if(Math.min(newRow,newCol)<0 || newRow>=rows || 
                    newCol>=cols || 
                    grid[newRow][newCol]!=1){
                        continue;
                    }
                    queue.add(new int[]{newRow,newCol});
                    grid[newRow][newCol] = 2;
                    fresh --;
                }
            }
            time++;

        }

        return fresh ==0?time:-1;
    }
}
