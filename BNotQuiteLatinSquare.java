import java.util.*;
public class BNotQuiteLatinSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            char[][] ch = new char[3][3];
            for(int i=0;i<3;i++){
                String line = sc.nextLine();
                for(int j=0;j<3;j++){
                    ch[i][j] = line.charAt(j);
                }
            }
            int index = 0;
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(ch[i][j]=='?') {
                        index = i;
                        break;
                    }
                }
            }
            int countA=0;
            int countB=0;
            int countC=0;
            for(int i=0;i<3;i++){
                if(ch[index][i]=='A') countA=1;
                else if(ch[index][i]=='B') countB=1;
                else countC = 1;
            }
            if(countA==0) System.out.println('A');
            else if(countB==0) System.out.println('B');
            else System.out.println('C');
        }
    }
}
