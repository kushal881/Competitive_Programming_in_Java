package backTracking;

public class RatInMaze2 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        boolean[][] isVisited = new boolean[rows][cols];
        printmaze(0,0,rows-1,cols-1,"",isVisited);
    }

    private static void printmaze(int sr, int sc, int er, int ec,String s,boolean[][] isVisited) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc]==true) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        printmaze(sr,sc+1,er,ec,s+"R",isVisited);
        printmaze(sr+1,sc,er,ec,s+"D",isVisited);
        printmaze(sr,sc-1,er,ec,s+"L",isVisited);
        printmaze(sr-1,sc,er,ec,s+"U",isVisited);
        isVisited[sr][sc] = false;
    }
}
