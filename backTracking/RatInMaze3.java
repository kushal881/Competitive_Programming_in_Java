package backTracking;

public class RatInMaze3 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] maze = {{1,0,0,0},
                        {1,1,0,0},
                        {0,1,1,0},
                        {0,1,1,1}};
        printmaze(0,0,rows-1,cols-1,"",maze);
    }
    private static void printmaze(int sr, int sc, int er, int ec,String s,int[][] maze) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        if(maze[sr][sc]==-1) return;
        maze[sr][sc] = -1;
        printmaze(sr,sc+1,er,ec,s+"R",maze);
        printmaze(sr+1,sc,er,ec,s+"D",maze);
        printmaze(sr,sc-1,er,ec,s+"L",maze);
        printmaze(sr-1,sc,er,ec,s+"U",maze);
        maze[sr][sc] = 1;
    }
}
