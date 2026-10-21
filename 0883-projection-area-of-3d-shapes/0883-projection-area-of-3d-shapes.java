class Solution {
    public int projectionArea(int[][] grid) {
        int n=grid.length;
        int top=0,front=0,side=0;
        for(int i=0; i<n; i++){
            int rowmax=0,colmax=0;
            for(int j=0; j<n; j++){
                if(grid[i][j]>0){
                    top++;
                }
                rowmax=Math.max(rowmax,grid[i][j]);
                colmax=Math.max(colmax,grid[j][i]);
                
            }
            side+=rowmax;
            front+=colmax;
           
        }
        return top + side + front;
    }
}