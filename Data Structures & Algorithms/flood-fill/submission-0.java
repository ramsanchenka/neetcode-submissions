class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
         int original = image[sr][sc];
        if (original == color) return image; // important
        dfs(image,sr,sc, original,color);
        return image;
    }

    void dfs (int[][] image, int row, int col, int color, int newColor){
        if(row<0 || col < 0 || row>=image.length||col>=image[row].length ){
        return;
        }
        if(image[row][col]!=color){ 
        return;
        }
        image[row][col] = newColor;
        dfs(image, row -1, col, color, newColor);
                dfs(image, row, col-1, color, newColor);
                        dfs(image, row +1, col, color, newColor);
        dfs(image, row, col+1, color, newColor);


    }
}