import java.util.*;
public class Bosumania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            char[][] ch = new char[n][4];
            for(int i=0;i<n;i++){
                for(int j=0;j<4;j++){
                    ch[i][j] = sc.next().charAt(0);
                }
            }
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                for(int j=0;j<4;j++){
                    if(ch[i][j]=='#') arr[i]=j+1;
                }
            }
            for(int i=n-1;i>=0;i--) System.out.print(arr[i]+" ");
        }
    }
}
