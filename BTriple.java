import java.util.*;
public class BTriple {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0){
          int n = sc.nextInt();
          int[] arr = new int[n];
          for(int i=0;i<n;i++){
              arr[i] = sc.nextInt();
          }
          int first = -1;
          int second=1;
          Arrays.sort(arr);
          for(int i=0;i<n-1;i++){
              if(arr[i]==arr[i+1]) second++;
              else second=1;
              if(second==3) first=arr[i];
          }
          System.out.println(first);
      }
    }
}
