package com.company;

import java.util.Iterator;
import java.util.LinkedList;

import static com.company.DetectCycle.Color.WHITE;

/**
 * Created by jiteshnambiar on 4/12/16.
 */




public class DetectCycle {
    public enum Color {
        WHITE(0),
        GREY(1),
        BLACK(2);
        int value;

        Color(int val)
        {
            value=val;
        }
    }
    int V ;
    LinkedList<Integer> adj[];

    DetectCycle(int v){
        this.V=v;
        adj=new LinkedList[V];
        for(int i=0;i<V;i++){
            adj[i]=new LinkedList<>();
        }
    }

    void addEdge(int v ,int w){
        adj[v].add(w);
    }


     boolean isCyclic(){
     boolean visited[]=new boolean[V];
         for(int i=0;i<V;i++){
             visited[i]=false;
         }
         for(int i=0;i<V;i++)
         {
             if(!visited[i])
             {
               if(isCyclicUtil(visited,i,-1))
               {
                return true;
               }
             }
         }
     return false;
     }

    boolean isCyclicUtil(boolean[] visited,int start,int parent){
        visited[start]=true;
        Integer next;
        Iterator<Integer> iterator=adj[start].iterator();
        while(iterator.hasNext()){
            next=iterator.next();
            if(!visited[next]){
             if(isCyclicUtil(visited,next,start)){
                 return true;
             }
            }else{
                if(next!=parent){
                 return true;
                }
            }
        }


      return  false;
    }



    boolean isCyclicDirected(){
        int[] color=new int[V];
        for(int i=0;i<V;i++){
            color[i]=Color.WHITE.value;

        }

        for(int i=0;i<V;i++){
            if(color[i]==Color.WHITE.value){
                if(isCyclicDirectedUtil(color,i)){
                 return true;
                }
            }
        }
        return false ;
    }


    boolean isCyclicDirectedUtil(int [] color,int start){
        color[start]=Color.GREY.value;
        Integer next;
        Iterator<Integer> iterator=adj[start].iterator();
        while(iterator.hasNext()){
            next=iterator.next();

            if(color[next]==Color.GREY.value){
                return true;
            }
            if(color[next]==Color.WHITE.value){
              if(isCyclicDirectedUtil(color,next)){
                  return true;
              }
            }
        }
    color[start]=  Color.BLACK.value;
    return false;}



    boolean isCyclicRecur(){
        boolean visited[]=new boolean[V];
        boolean recur[]=new boolean[V];
        for(int i =0;i<V;i++){
            visited[i]=false;
            recur[i]=false;
        }
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                if(cyclicRecurUtil(visited,recur,i)){
                    return true;
                }
            }
        }
    return false ;}



    boolean cyclicRecurUtil(boolean[] visited,boolean[] recur,int start){
        visited[start]=true;
        recur[start]=true;
        Integer next;
       Iterator<Integer> iterator=adj[start].iterator();
        while(iterator.hasNext()) {
            next = iterator.next();

            if(recur[next]){
                return true;
            }

            if (!visited[next]) {
                if (cyclicRecurUtil(visited, recur, next)) {
                    return true;
                }


            }

        }
        recur[start]=false;
        return false;
    }




    public static  void main(String[] args){
        DetectCycle detectCycle=new DetectCycle(6);


        //detect cycle in a undirected graph
        detectCycle.addEdge(1, 0);
        detectCycle.addEdge(0, 2);
        detectCycle.addEdge(2, 0);
        detectCycle.addEdge(0, 3);
        detectCycle.addEdge(3, 4);
        if(detectCycle.isCyclic()){
            System.out.println("graph is having a cycle ");
        }
        else {
            System.out.println("graph is not having a cycle ");
        }

        //detect cycle in a directed graph using colors --

        //white =not processed
        //grey =processing
        //black =processed

        DetectCycle detectCycleDirected=new DetectCycle(4);
        detectCycleDirected.addEdge(0, 1);
        detectCycleDirected.addEdge(0, 2);
        detectCycleDirected.addEdge(1, 2);
        detectCycleDirected.addEdge(2, 0);
        detectCycleDirected.addEdge(2, 3);
        detectCycleDirected.addEdge(3, 3);

        if(detectCycleDirected.isCyclicDirected()){
            System.out.println("graph is having a cycle");
        }
        else {
            System.out.println("graph is not having cycle ");
        }
        // detecting a cycle in directed graph using recursionarray

        DetectCycle detectedCycleRecurArray=new DetectCycle(4);
        detectedCycleRecurArray.addEdge(0, 1);
        detectedCycleRecurArray.addEdge(0, 2);
        detectedCycleRecurArray.addEdge(1, 2);
        detectedCycleRecurArray.addEdge(2, 0);
        detectedCycleRecurArray.addEdge(2, 3);
        detectedCycleRecurArray.addEdge(3, 3);
        if(detectedCycleRecurArray.isCyclicRecur()){
          System.out.println("Graph has a cycle");
        }
        else {
            System.out.println("Graph doesnot have cycle");
        }
    }
}
