import java.util.*;
public class AGregsWorkout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int chest=0;
        int biceps=0;
        int back=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(i%3==0) chest+=arr[i];
            else if(i%3==1) biceps+=arr[i];
            else{
                back+=arr[i];
            }
        }
        if(chest>biceps && chest>back) System.out.println("chest");
        else if(biceps>chest && biceps>back) System.out.println("biceps");
        else System.out.println("back");
    }
}
