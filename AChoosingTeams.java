import java.util.*;
public class AChoosingTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count =0;
        int a=0;
        Arrays.sort(arr);
        int i=0;
        while(i<n-2){
            for(int j=1;j<=k;j++){
                if(arr[i]<5) arr[i]++;
                else a=1;
                if(arr[i+1]<5) arr[i+1]++;
                else a=1;
                if(arr[i+2]<5) arr[i+2]++;
                else a=1;
            }
            if(a==0) count++;
            i+=3;
        }
        System.out.println(count);
    }
}
