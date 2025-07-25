package backTracking;

public class maxKnightsNXN {
    static int maxKnights = -1;
    public static boolean isSafe(char[][] board,int row,int col){
        int n  = board.length;
        int i,j;
        i = row-2;
        j=col+1;
        if(i>=0 && j<n && board[i][j]=='K')  return false;
        i = row-2;
        j=col-1;
        if(i>=0 && j>=0 && board[i][j]=='K')  return false;
        i = row+2;
        j=col+1;
        if(i<n && j<n && board[i][j]=='K')  return false;
        i = row+2;
        j=col-1;
        if(i<n && j>=0 && board[i][j]=='K')  return false;
        i = row-1;
        j=col+2;
        if(i>=0 && j<n && board[i][j]=='K')  return false;
        i = row+1;
        j=col+2;
        if(i<n && j<n && board[i][j]=='K')  return false;
        i = row-1;
        j=col-2;
        if(i>=0 && j>=0 && board[i][j]=='K')  return false;
        i = row+1;
        j=col-2;
        if(i<n && j>=0 && board[i][j]=='K')  return false;
        return true;
    }

    public static void NKnight(char[][] board,int row,int col,int num){
        int n = board.length;
        if(row==n){
            for (int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            maxKnights = Math.max(maxKnights,num);
            return;
        }
        else if(isSafe(board,row,col)){
            board[row][col] = 'K';
            if(col!=n-1) NKnight(board,row,col+1,num+1);
            else NKnight(board,row+1,0,num+1);
            board[row][col] = 'X';
        }
        if(col!=n-1) NKnight(board,row,col+1,num);
        else NKnight(board,row+1,0,num);
    }
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        NKnight(board,0,0,0);
        System.out.println(maxKnights);
    }
}
