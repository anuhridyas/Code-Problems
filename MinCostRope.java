package com.company;

import java.util.PriorityQueue;

/**
 * Created by jiteshnambiar on 4/21/16.
 */
public class MinCostRope {
     public static  int minimumCostRopes(int[] ropes){
         PriorityQueue<Integer> pq=new PriorityQueue<>();
         for(int i:ropes){
             pq.add(i);
         }
         int cost=0;
         while(pq.size()>=2){

            int sum=pq.poll()+pq.poll();

             cost+=sum;
             pq.add(sum);
         }



     return cost;
     }



    public static  void main(String[] args){
        int[] ropes={4, 2, 4, 3, 6};
        System.out.println(minimumCostRopes(ropes));
    }
}
