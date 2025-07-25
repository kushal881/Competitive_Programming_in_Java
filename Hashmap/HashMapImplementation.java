package Hashmap;

import java.util.LinkedList;

public class HashMapImplementation {
    static class MyHashMap<K, V>{
        public static final int DEFAULT_CAPACITY =  4;
        public static final float DEFAULT_LOAD_FACTOR =  0.75f;
        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N){
            buckets = new LinkedList[N];
            for(int i=0;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunc(K key){
            int hc = key.hashCode();
            return (Math.abs(hc))%buckets.length;
        }

        private int searchInBucket(LinkedList<Node> ll,K key){
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length*2);
            n=0;
            for(var bucket: oldBuckets){
                for(var node: bucket){
                    put(node.key, node.value);
                }
            }
        }

        public int capacity(){
            return buckets.length;
        }
        public float load(){
            return (n*1.0f)/buckets.length;
        }

        public int size(){
            return n;
        }
        public void put(K key, V value){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei==-1){
                Node node = new Node(key,value);
                currBucket.add(node);
                n++;
            }
            else{
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }

            if(n>=buckets.length*DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }
        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket =  buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei!=-1){
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }
        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket =  buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei!=-1){
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null;
        }


    }
    public static void main(String[] args) {
        MyHashMap<String,Integer> mp = new MyHashMap<>();
        System.out.println("Testing Put");
        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        System.out.println("Testing size: "+ mp.size());
        mp.put("c",30);
        System.out.println("Testing size: "+mp.size());
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.remove("c"));
        System.out.println(mp.size());
        System.out.println("CAPACITY: " + mp.capacity());
        System.out.println("LOAD: "+ mp.load());
    }
}
