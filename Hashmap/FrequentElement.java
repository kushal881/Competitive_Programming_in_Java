package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequentElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer,Integer> mp = new HashMap<>();
        for(int el: arr){
            if(!mp.containsKey(el)){
                mp.put(el,1);
            } else{
                mp.put(el,mp.get(el)+1);
            }
        }
        System.out.println(mp.entrySet());
        int freq = 0, ans = -1;
        for(var e: mp.entrySet()){
            if(e.getValue()>freq){
                freq = e.getValue();
                ans = e.getKey();
            }
        }
        System.out.println(ans);
    }
}
