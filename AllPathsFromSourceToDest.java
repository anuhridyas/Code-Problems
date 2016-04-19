package com.company;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by jiteshnambiar on 4/12/16.
 */
public class AllPathsFromSourceToDest {

    int V;
    LinkedList<Integer>[] adj;

    public  AllPathsFromSourceToDest(int V){
        this.V=V;
        adj=new LinkedList[V];
        for(int i=0;i<V;i++){
            adj[i]=new LinkedList<>();
        }

    }


    void addEdge(int v,int w){
        adj[v].add(w);
    }

    void printPathFrom(int start,int dest){

        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            visited[i]=false;
        }

        int[] path=new int[V];
        int pathIndex=0;

        printPathUtil(start,dest,visited,path,pathIndex);

    }

     void printPathUtil(int start,int dest,boolean[] visited,int[] path,int pathIndex){
         visited[start]=true;

         path[pathIndex]=start;
         pathIndex++;

         if(start==dest){
             for(int i=0;i<pathIndex;i++){
                 System.out.print(path[i]+" ");

             }
             System.out.println();
         }
         else {
             Iterator<Integer> i=adj[start].iterator();
             while(i.hasNext()){
                 Integer nex=i.next();
                 if(visited[nex]==false){
                     printPathUtil(nex,dest,visited,path,pathIndex);
                 }

             }

         }

         pathIndex--;
         visited[start]=false;

     }



    public static  void main(String[] args ){
        AllPathsFromSourceToDest allPathsFromSourceToDest=new AllPathsFromSourceToDest(4);
        allPathsFromSourceToDest.addEdge(0, 1);
        allPathsFromSourceToDest.addEdge(0, 2);
        allPathsFromSourceToDest.addEdge(0, 3);
        allPathsFromSourceToDest.addEdge(2, 0);
        allPathsFromSourceToDest.addEdge(2, 1);
        allPathsFromSourceToDest.addEdge(1, 3);

        allPathsFromSourceToDest.printPathFrom(2,3);

    }
}
