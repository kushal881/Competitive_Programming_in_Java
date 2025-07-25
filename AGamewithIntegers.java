import java.util.*;
public class AGamewithIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int count=0;
            for(int i=0;i<10;i++){
                if(i%2==0) {
                    if ((n + 1) % 3 == 0 || (n - 1) % 3 == 0) {
                        count = 1;
                        System.out.println("First");
                        break;

                    } else {
                        n+=1;
                    }
                }
                else{
                    if ((n + 1) % 3 == 0 || (n - 1) % 3 == 0) {
                        count = 1;
                        System.out.println("Second");
                        break;

                    } else {
                        n+=1;
                    }
                }
            }
            if(count==0) System.out.println("Second");
        }
    }
}
