package Graphs;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Scanner;

//public class Adjecency {
//    static class Edge{
//        int src;
//        int dst;
//        int wt;
//        public Edge(int s,int d,int w){
//            this.src = s;
//            this.dst = d;
//            this.wt = w;
//        }
//    }
//    public static void createGraph(ArrayList<Edge> graph[]){
//        for(int i=0;i< graph.length;i++){
//            graph[i] = new ArrayList<Edge>();
//        }
//       graph[0].add(new Edge(0,2,2));
//
//        graph[1].add(new Edge(1,2,10));
//        graph[1].add(new Edge(1,3,0));
//
//        graph[2].add(new Edge(2,0,2));
//        graph[2].add(new Edge(2,1,10));
//        graph[2].add(new Edge(2,3,-1));
//
//        graph[3].add(new Edge(3,1,0));
//        graph[3].add(new Edge(3,2,-1));
//    }
//
//    public static void main(String[] args) {
//        int V = 4;
//        ArrayList<Edge> graph[] = new ArrayList[V];
//        createGraph(graph);
//
//        for(int i=0;i<graph[2].size();i++){
//            Edge e = graph[2].get(i);
//            System.out.println(e.dst+" , "+e.wt);
//        }
//    }
//}

//public class Adjecency {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int vertex = sc.nextInt();
//        int edges = sc.nextInt();
//        int[][] arr=new int[vertex][vertex];
//        for(int i=0;i<edges;i++){
//            int u = sc.nextInt();
//            int v =sc.nextInt();
//            arr[u][v]=1;
//        }
//        for(int i=0;i<vertex;i++){
//            for(int j=0;j<vertex;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}