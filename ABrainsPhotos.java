import java.util.*;
public class ABrainsPhotos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] ch = new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ch[i][j] = sc.next().charAt(0);
            }
        }
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ch[i][j]=='B' || ch[i][j] =='W' || ch[i][j]=='G'){
                    count++;
                }
            }
        }
        if(count==n*m) System.out.println("#Black&White");
        else System.out.println("#Color");
    }
}
