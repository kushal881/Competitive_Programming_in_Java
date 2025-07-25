import java.util.*;
public class APoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int crime=0;
        int hire=0;
        for(int i=0;i<n;i++){
            if(arr[i]==-1 && hire==0){
                crime++;
            }
            else if(arr[i]>0){
                hire+=arr[i];
            }
            else if(arr[i]==-1 && hire>0){
                hire--;
            }
        }
        System.out.println(crime);
    }
}
