/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Graph
{
    int v;
    private LinkedList<Integer> adj[];
    
    public Graph(int v)
    {
       this.v=v;
       adj = new LinkedList[v];
       for(int i=0;i<v;i++){
           adj[i]=new LinkedList();
       }
    }
    
    public void addEdge(int v,int w){
        adj[v].add(w);
    }
    
    public void dfs(int startingVertex){
        Stack<Integer> s=new Stack<Integer>();
        boolean[] visited=new boolean[v];
        for(int i=0;i<v;i++){
            visited[i]=false;
        }
        s.push(startingVertex);
        visited[startingVertex]=true;
        
        while(!s.isEmpty())
        {
          int n=s.pop();
          System.out.println(n);
          
          ListIterator<Integer> listIteratorObject = adj[n].listIterator();
          
        //  Iterator<Integer> i=new ListIterator();
          while(listIteratorObject.hasNext())
          {
              Integer next=listIteratorObject.next();
              if(visited[next]!=true){
                  s.push(next);
                  visited[next]=true;
            }
          }
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    System.out.println("#####");
		Graph g=new Graph(5);
	    g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 0);
        g.dfs(0);
	}
}
