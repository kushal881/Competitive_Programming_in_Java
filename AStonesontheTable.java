import java.util.*;
public class AStonesontheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(1<<n);
        String str = sc.next();

        char a = str.charAt(0);
        int count=0;
        for(int i=1;i<n;i++){
            if(a==str.charAt(i)){
                count++;
            }
            else{
                a=str.charAt(i);
            }
        }
        System.out.println(count);
    }
}
