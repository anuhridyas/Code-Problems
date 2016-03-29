package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/**
 * Created by jiteshnambiar on 3/29/16.
 */
public class BFS {

    private  int v;
    private LinkedList<Integer> adj[];

    public BFS(int v){
        this.v=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<Integer>();
        }
    }

    public  void addEdge(int v ,int w){
        adj[v].add(w);
    }

    public void bfsTraversal(int startingPoint){
        boolean[] visited=new boolean[v];
        for(int i=0;i<v;i++){
            visited[i]=false;
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(startingPoint);
        visited[startingPoint]=true;
        while(!q.isEmpty()){
            int n=q.poll();
            System.out.println(n);
            ListIterator<Integer> iterator=adj[startingPoint].listIterator();
            while(iterator.hasNext()){
                Integer next=iterator.next();
                if(visited[next]!=true){
                    q.add(next);
                    visited[next]=true;
                }
            }
        }

    }

    public static void main (String[] args){
        BFS g =new BFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.bfsTraversal(2);
    }
}
