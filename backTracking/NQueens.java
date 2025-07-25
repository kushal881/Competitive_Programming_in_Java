package backTracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        nQueen(board,0);
    }

    private static void nQueen(char[][] board, int row) {
        if(row==board.length){
            for (int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                nQueen(board,row+1);
                board[row][j] = 'X';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q')  return false;
        }
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q')  return false;
        }
        int i=row;
        int j=col;
        while(i>=0 && j<board.length){
            if(board[i][j]=='Q')  return false;
            i--;
            j++;
        }
        i = row;
        j=col;
        while(i<board.length && j<board.length){
            if(board[i][j]=='Q')  return false;
            i++;
            j++;
        }
        i = row;
        j=col;
        while(i<board.length && j>=0){
            if(board[i][j]=='Q')  return false;
            i++;
            j--;
        }
        i = row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q')  return false;
            i--;
            j--;
        }
        return true;
    }
}

