package Hashmap;

import java.util.*;

public class hashMap {
    public static void HashMapMethods(){
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rohit", 19);
        mp.put("Harry",18);
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Rahul"));
        mp.put("Akash", 25);
        System.out.println(mp.get("Akash"));
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.remove("riya"));
        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.containsKey("Yash"));
        mp.putIfAbsent("Yashika",30);
        mp.putIfAbsent("Yash", 30);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        for(String key: mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String, Integer> e: mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }

    }
    public static void main(String[] args) {
        HashMapMethods();
    }
}
